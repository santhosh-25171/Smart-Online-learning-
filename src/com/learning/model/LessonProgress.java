package com.learning.model;

import java.time.LocalDateTime;

public class LessonProgress {
    private String progressId;
    private String studentId;
    private String lessonId;
    private boolean completed;
    private int percentCompleted;
    private LocalDateTime lastUpdated;

    public LessonProgress() {
    }

    public LessonProgress(String progressId, String studentId, String lessonId, boolean completed, int percentCompleted, LocalDateTime lastUpdated) {
        this.progressId = progressId;
        this.studentId = studentId;
        this.lessonId = lessonId;
        this.completed = completed;
        this.percentCompleted = percentCompleted;
        this.lastUpdated = lastUpdated;
    }

    public String getProgressId() {
        return progressId;
    }

    public void setProgressId(String progressId) {
        this.progressId = progressId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getLessonId() {
        return lessonId;
    }

    public void setLessonId(String lessonId) {
        this.lessonId = lessonId;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public int getPercentCompleted() {
        return percentCompleted;
    }

    public void setPercentCompleted(int percentCompleted) {
        this.percentCompleted = percentCompleted;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
