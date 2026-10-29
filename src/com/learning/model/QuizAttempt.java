package com.learning.model;

import java.time.LocalDateTime;

public class QuizAttempt {
    private String attemptId;
    private String studentId;
    private String courseId;
    private String lessonId;
    private double score;
    private int totalQuestions;
    private boolean passed;
    private LocalDateTime attemptedAt;

    public QuizAttempt() {
    }

    public QuizAttempt(String attemptId, String studentId, String courseId, String lessonId, double score, int totalQuestions, boolean passed, LocalDateTime attemptedAt) {
        this.attemptId = attemptId;
        this.studentId = studentId;
        this.courseId = courseId;
        this.lessonId = lessonId;
        this.score = score;
        this.totalQuestions = totalQuestions;
        this.passed = passed;
        this.attemptedAt = attemptedAt;
    }

    public String getAttemptId() {
        return attemptId;
    }

    public void setAttemptId(String attemptId) {
        this.attemptId = attemptId;
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

    public String getLessonId() {
        return lessonId;
    }

    public void setLessonId(String lessonId) {
        this.lessonId = lessonId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public LocalDateTime getAttemptedAt() {
        return attemptedAt;
    }

    public void setAttemptedAt(LocalDateTime attemptedAt) {
        this.attemptedAt = attemptedAt;
    }
}
