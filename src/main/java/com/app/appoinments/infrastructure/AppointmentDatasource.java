package com.app.appoinments.infrastructure;

import java.util.List;
import java.util.Optional;

import com.app.appoinments.domain.Appointment;
import com.app.appoinments.domain.IAppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppointmentDatasource {
    
    @Autowired
    private IAppointmentRepository appointmentRepository;

    public List<Appointment> findAll() {
        return appointmentRepository.findAll();
    }

    public Optional<Appointment> findById(Long appointmentId) {
        return appointmentRepository.findById(appointmentId);
    }

    public Appointment save(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public Appointment update(Appointment appointment, Long appointmentId) {
        return appointmentRepository.save(appointment);
    }

    public void deleteById(Long appointmentId) {
        appointmentRepository.deleteById(appointmentId);
    }
} 