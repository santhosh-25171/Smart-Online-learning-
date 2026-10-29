package com.learning.repository;

import com.learning.model.QuizAttempt;
import java.util.ArrayList;
import java.util.List;

public class QuizAttemptRepository {
    private final List<QuizAttempt> attempts = new ArrayList<>();

    public void addAttempt(QuizAttempt attempt) {
        attempts.add(attempt);
    }

    public QuizAttempt findById(String id) {
        for (QuizAttempt attempt : attempts) {
            if (attempt.getAttemptId().equals(id)) {
                return attempt;
            }
        }
        return null;
    }

    public List<QuizAttempt> findAll() {
        return attempts;
    }

    public boolean deleteById(String id) {
        return attempts.removeIf(attempt -> attempt.getAttemptId().equals(id));
    }
}
