package com.app.reviews.application;

import java.util.List;

import com.app.reviews.domain.reviews;
import com.app.reviews.domain.IreviewsRepository;
import com.app.reviews.domain.IreviewsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class reviewsService implements IreviewsService {
    private final IreviewsRepository reviewsRepository;

    public reviewsService(IreviewsRepository reviewsRepository) {
        this.reviewsRepository = reviewsRepository;
    }

    @Override
    public List<reviews> findAll() {
        return reviewsRepository.findAll();
    }

    @Override
    public reviews findById(Long id) {
        return reviewsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("reviews not found with ID: " + id));
    }

    @Override
    @Transactional
    public reviews save(reviews reviews) {
        return reviewsRepository.save(reviews);
    }

    @Override
    @Transactional
    public reviews update(reviews reviews, Long id) {
        reviews existing = findById(id);
        // Aquí puedes actualizar solo los campos necesarios
        reviews.setreviewsId(existing.getreviewsId());
        return reviewsRepository.save(reviews);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        reviews reviews = findById(id);
        reviewsRepository.delete(reviews);
    }
} 