package com.app.workinghours.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IworkinghoursRepository extends JpaRepository<workinghours, Long> {
    // Spring Data JPA will automatically implement all the required methods
} 