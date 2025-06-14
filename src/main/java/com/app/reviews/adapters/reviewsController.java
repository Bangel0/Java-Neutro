package com.app.reviews.adapters;

import java.util.List;

import com.app.reviews.domain.IreviewsService;
import com.app.reviews.domain.reviews;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reviewss")
public class reviewsController {
    private final IreviewsService reviewsService;

    public reviewsController(IreviewsService reviewsService) {
        this.reviewsService = reviewsService;
    }

    @GetMapping
    public ResponseEntity<List<reviews>> getAllreviewss() {
        List<reviews> reviewss = reviewsService.findAll();
        return ResponseEntity.ok(reviewss);
    }

    @GetMapping("/{id}")
    public ResponseEntity<reviews> getreviewsById(@PathVariable Long id) {
        reviews reviews = reviewsService.findById(id);
        return ResponseEntity.ok(reviews);
    }

    @PostMapping
    public ResponseEntity<reviews> createreviews(@RequestBody reviews reviews) {
        reviews newreviews = reviewsService.save(reviews);
        return ResponseEntity.ok(newreviews);
    }

    @PutMapping("/{id}")
    public ResponseEntity<reviews> updatereviews(@PathVariable Long id, @RequestBody reviews reviews) {
        reviews updatedreviews = reviewsService.update(reviews, id);
        return ResponseEntity.ok(updatedreviews);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletereviews(@PathVariable Long id) {
        reviewsService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
} 