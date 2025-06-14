package com.app.services.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IservicesRepository extends JpaRepository<services, Long> {
    // Spring Data JPA will automatically implement all the required methods
} 