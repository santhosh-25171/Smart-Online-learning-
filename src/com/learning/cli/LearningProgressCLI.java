package com.learning.cli;

import com.learning.model.LessonProgress;
import java.time.LocalDateTime;
import java.util.Scanner;

public class LearningProgressCLI {
    public void showMenu() {
        showMenu(new Scanner(System.in));
    }

    public void showMenu(Scanner scanner) {
        System.out.println("=== Learning Progress Menu ===");
        System.out.print("Enter progress id: ");
        String progressId = scanner.nextLine();
        System.out.print("Enter student id: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter lesson id: ");
        String lessonId = scanner.nextLine();

        LessonProgress progress = new LessonProgress(progressId, studentId, lessonId, true, 100, LocalDateTime.now());
        System.out.println("Progress recorded for lesson: " + progress.getLessonId());
    }
}
