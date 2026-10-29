package com.learning.model;

import java.time.LocalDate;

public class Certificate {
    private String certificateId;
    private String studentId;
    private String courseId;
    private LocalDate issuedDate;
    private String serialNumber;
    private String status;

    public Certificate() {
    }

    public Certificate(String certificateId, String studentId, String courseId, LocalDate issuedDate, String serialNumber, String status) {
        this.certificateId = certificateId;
        this.studentId = studentId;
        this.courseId = courseId;
        this.issuedDate = issuedDate;
        this.serialNumber = serialNumber;
        this.status = status;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
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

    public LocalDate getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(LocalDate issuedDate) {
        this.issuedDate = issuedDate;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
