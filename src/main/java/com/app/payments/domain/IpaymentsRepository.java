package com.app.payments.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IpaymentsRepository extends JpaRepository<payments, Long> {
    // Spring Data JPA will automatically implement all the required methods
} 