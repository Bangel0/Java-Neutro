package com.app.locations.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IlocationsRepository extends JpaRepository<locations, Long> {
    // Spring Data JPA will automatically implement all the required methods
} 