package com.learning.model;

public class Student extends User {
    private String studentId;
    private String department;

    public Student() {
    }

    public Student(String id, String name, String email, String studentId, String department) {
        super(id, name, email);
        this.studentId = studentId;
        this.department = department;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
