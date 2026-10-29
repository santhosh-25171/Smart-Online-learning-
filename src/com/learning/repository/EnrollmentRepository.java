package com.learning.repository;

import com.learning.model.Enrollment;
import java.util.ArrayList;
import java.util.List;

public class EnrollmentRepository {
    private final List<Enrollment> enrollments = new ArrayList<>();

    public void addEnrollment(Enrollment enrollment) {
        enrollments.add(enrollment);
    }

    public Enrollment findById(String id) {
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getEnrollmentId().equals(id)) {
                return enrollment;
            }
        }
        return null;
    }

    public List<Enrollment> findAll() {
        return enrollments;
    }

    public boolean deleteById(String id) {
        return enrollments.removeIf(enrollment -> enrollment.getEnrollmentId().equals(id));
    }
}
