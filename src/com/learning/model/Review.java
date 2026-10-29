package com.learning.model;

import java.time.LocalDateTime;

public class Review {
    private String reviewId;
    private String studentId;
    private String courseId;
    private int rating;
    private String comment;
    private LocalDateTime createdAt;

    public Review() {
    }

    public Review(String reviewId, String studentId, String courseId, int rating, String comment, LocalDateTime createdAt) {
        this.reviewId = reviewId;
        this.studentId = studentId;
        this.courseId = courseId;
        this.rating = rating;
        this.comment = comment;
        this.createdAt = createdAt;
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
