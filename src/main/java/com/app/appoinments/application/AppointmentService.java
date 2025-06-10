package com.app.appoinments.application;

import com.app.appoinments.domain.Appointment;
import com.app.appoinments.domain.IAppointmentRepository;
import com.app.appoinments.domain.IAppointmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class AppointmentService implements IAppointmentService {
    private final IAppointmentRepository appointmentRepository;

    public AppointmentService(IAppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public List<Appointment> findAll() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment findById(Long id) {
        return appointmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Appointment not found with ID: " + id));
    }

    @Override
    @Transactional
    public Appointment save(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    @Transactional
    public Appointment update(Appointment appointment, Long id) {
        Appointment existing = findById(id);
        // Aquí puedes actualizar solo los campos necesarios
        appointment.setAppointmentId(existing.getAppointmentId());
        return appointmentRepository.save(appointment);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        Appointment appointment = findById(id);
        appointmentRepository.delete(appointment);
    }
} 