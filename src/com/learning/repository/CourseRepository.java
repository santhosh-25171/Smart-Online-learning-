package com.learning.repository;

import com.learning.model.Course;
import java.util.ArrayList;
import java.util.List;

public class CourseRepository {
    private final List<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Course findById(String id) {
        for (Course course : courses) {
            if (course.getCourseId().equals(id)) {
                return course;
            }
        }
        return null;
    }

    public List<Course> findAll() {
        return courses;
    }

    public boolean deleteById(String id) {
        return courses.removeIf(course -> course.getCourseId().equals(id));
    }
}
