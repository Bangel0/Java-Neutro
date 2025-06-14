package com.app.reviews.infrastructure;

import java.util.List;
import java.util.Optional;

import com.app.reviews.domain.reviews;
import com.app.reviews.domain.IreviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class reviewsDatasource {
    
    @Autowired
    private IreviewsRepository reviewsRepository;

    public List<reviews> findAll() {
        return reviewsRepository.findAll();
    }

    public Optional<reviews> findById(Long reviewsId) {
        return reviewsRepository.findById(reviewsId);
    }

    public reviews save(reviews reviews) {
        return reviewsRepository.save(reviews);
    }

    public reviews update(reviews reviews, Long reviewsId) {
        return reviewsRepository.save(reviews);
    }

    public void deleteById(Long reviewsId) {
        reviewsRepository.deleteById(reviewsId);
    }
} 