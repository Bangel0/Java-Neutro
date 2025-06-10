package com.app.appoinments.infrastructure;

import com.app.appoinments.domain.Appointment;
import com.app.appoinments.domain.IAppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public class AppointmentDatasource implements IAppointmentRepository {
    
    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public List<Appointment> findAll() {
        return appointmentRepository.findAll();
    }

    @Override
    public Optional<Appointment> findById(Long appointmentId) {
        return appointmentRepository.findById(appointmentId);
    }

    @Override
    public Appointment save(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment update(Appointment appointment, Long appointmentId) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public void deleteById(Long appointmentId) {
        appointmentRepository.deleteById(appointmentId);
    }
} 