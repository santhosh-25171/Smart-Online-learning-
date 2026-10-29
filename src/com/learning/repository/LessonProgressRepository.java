package com.learning.repository;

import com.learning.model.LessonProgress;
import java.util.ArrayList;
import java.util.List;

public class LessonProgressRepository {
    private final List<LessonProgress> progresses = new ArrayList<>();

    public void addProgress(LessonProgress progress) {
        progresses.add(progress);
    }

    public LessonProgress findById(String id) {
        for (LessonProgress progress : progresses) {
            if (progress.getProgressId().equals(id)) {
                return progress;
            }
        }
        return null;
    }

    public List<LessonProgress> findAll() {
        return progresses;
    }

    public boolean deleteById(String id) {
        return progresses.removeIf(progress -> progress.getProgressId().equals(id));
    }
}
