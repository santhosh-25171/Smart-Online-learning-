package com.learning.service;

import com.learning.model.LessonProgress;
import com.learning.repository.LessonProgressRepository;
import java.util.List;

public class LearningProgressService {
    private final LessonProgressRepository lessonProgressRepository;

    public LearningProgressService(LessonProgressRepository lessonProgressRepository) {
        this.lessonProgressRepository = lessonProgressRepository;
    }

    public void addProgress(LessonProgress progress) {
        if (progress == null || progress.getStudentId() == null || progress.getStudentId().isEmpty()) {
            throw new IllegalArgumentException("Student ID is required");
        }
        lessonProgressRepository.addProgress(progress);
    }

    public LessonProgress getProgressById(String id) {
        return lessonProgressRepository.findById(id);
    }

    public List<LessonProgress> getAllProgress() {
        return lessonProgressRepository.findAll();
    }
}
