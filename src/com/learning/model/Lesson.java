package com.learning.model;

public class Lesson {
    private String lessonId;
    private String courseId;
    private String sectionId;
    private String title;
    private String contentType;
    private int durationMinutes;
    private String videoUrl;
    private String notes;

    public Lesson() {
    }

    public Lesson(String lessonId, String courseId, String sectionId, String title, String contentType, int durationMinutes, String videoUrl, String notes) {
        this.lessonId = lessonId;
        this.courseId = courseId;
        this.sectionId = sectionId;
        this.title = title;
        this.contentType = contentType;
        this.durationMinutes = durationMinutes;
        this.videoUrl = videoUrl;
        this.notes = notes;
    }

    public String getLessonId() {
        return lessonId;
    }

    public void setLessonId(String lessonId) {
        this.lessonId = lessonId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
