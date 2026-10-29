package com.learning.model;

public class Instructor extends User {
    private String instructorId;
    private String specialization;

    public Instructor() {
    }

    public Instructor(String id, String name, String email, String instructorId, String specialization) {
        super(id, name, email);
        this.instructorId = instructorId;
        this.specialization = specialization;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
