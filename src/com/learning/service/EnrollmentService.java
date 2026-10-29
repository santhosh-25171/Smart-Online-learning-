package com.learning.service;

import com.learning.model.Enrollment;
import com.learning.repository.EnrollmentRepository;
import java.util.List;

public class EnrollmentService {
    private final EnrollmentRepository enrollmentRepository;

    public EnrollmentService(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    public void enrollStudent(Enrollment enrollment) {
        if (enrollment == null || enrollment.getStudentId() == null || enrollment.getStudentId().isEmpty()) {
            throw new IllegalArgumentException("Student ID is required");
        }
        enrollmentRepository.addEnrollment(enrollment);
    }

    public Enrollment getEnrollmentById(String id) {
        return enrollmentRepository.findById(id);
    }

    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepository.findAll();
    }
}
