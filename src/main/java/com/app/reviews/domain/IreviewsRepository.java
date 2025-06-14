package com.app.reviews.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IreviewsRepository extends JpaRepository<reviews, Long> {
    // Spring Data JPA will automatically implement all the required methods
} 