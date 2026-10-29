package com.learning.service;

import com.learning.model.Review;
import com.learning.repository.ReviewRepository;
import java.util.List;

public class ReviewService {
    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public void addReview(Review review) {
        if (review == null || review.getStudentId() == null || review.getStudentId().isEmpty()) {
            throw new IllegalArgumentException("Student ID is required");
        }
        reviewRepository.addReview(review);
    }

    public Review getReviewById(String id) {
        return reviewRepository.findById(id);
    }

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }
}
