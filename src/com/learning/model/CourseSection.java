package com.learning.model;

public class CourseSection {
    private String sectionId;
    private String courseId;
    private String title;
    private String description;
    private int orderIndex;

    public CourseSection() {
    }

    public CourseSection(String sectionId, String courseId, String title, String description, int orderIndex) {
        this.sectionId = sectionId;
        this.courseId = courseId;
        this.title = title;
        this.description = description;
        this.orderIndex = orderIndex;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(int orderIndex) {
        this.orderIndex = orderIndex;
    }
}
