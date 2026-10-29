package com.learning.repository;

import com.learning.model.Review;
import java.util.ArrayList;
import java.util.List;

public class ReviewRepository {
    private final List<Review> reviews = new ArrayList<>();

    public void addReview(Review review) {
        reviews.add(review);
    }

    public Review findById(String id) {
        for (Review review : reviews) {
            if (review.getReviewId().equals(id)) {
                return review;
            }
        }
        return null;
    }

    public List<Review> findAll() {
        return reviews;
    }

    public boolean deleteById(String id) {
        return reviews.removeIf(review -> review.getReviewId().equals(id));
    }
}
