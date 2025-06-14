package com.app.reviews.domain;

import java.util.List;

public interface IreviewsService {
    List<reviews> findAll();
    reviews findById(Long id);
    reviews save(reviews appointment);
    reviews update(reviews appointment, Long id);
    void deleteById(Long id);
} 