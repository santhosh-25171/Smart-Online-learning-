package com.learning.cli;

import com.learning.model.Review;
import java.time.LocalDateTime;
import java.util.Scanner;

public class ReviewCLI {
    public void showMenu() {
        showMenu(new Scanner(System.in));
    }

    public void showMenu(Scanner scanner) {
        System.out.println("=== Review Menu ===");
        System.out.print("Enter review id: ");
        String reviewId = scanner.nextLine();
        System.out.print("Enter student id: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter course id: ");
        String courseId = scanner.nextLine();

        Review review = new Review(reviewId, studentId, courseId, 5, "Excellent course!", LocalDateTime.now());
        System.out.println("Review submitted for course: " + review.getCourseId());
    }
}
