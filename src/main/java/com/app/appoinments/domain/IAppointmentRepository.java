package com.app.appoinments.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppointmentRepository extends JpaRepository<Appointment, Long> {
    // Métodos CRUD ya provistos por JpaRepository
    @Override
    @NonNull
    List<Appointment> findAll();
    @Override
    @NonNull
    Optional<Appointment> findById(Long appointmentId);
    @Override
    @NonNull
    Appointment save(Appointment appointment);
    @Override
    @NonNull
    Appointment update(Appointment appointment, Long appointmentId);
    @Override
    void deleteById(Long appointmentId);
} 