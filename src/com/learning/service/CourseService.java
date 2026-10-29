package com.learning.service;

import com.learning.model.Course;
import com.learning.repository.CourseRepository;
import java.util.List;

public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void addCourse(Course course) {
        if (course == null || course.getTitle() == null || course.getTitle().isEmpty()) {
            throw new IllegalArgumentException("Course title is required");
        }
        courseRepository.addCourse(course);
    }

    public Course getCourseById(String id) {
        return courseRepository.findById(id);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
}
