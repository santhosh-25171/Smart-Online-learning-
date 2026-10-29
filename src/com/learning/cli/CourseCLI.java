package com.learning.cli;

import com.learning.model.Course;
import java.util.Scanner;

public class CourseCLI {
    public void showMenu() {
        showMenu(new Scanner(System.in));
    }

    public void showMenu(Scanner scanner) {
        System.out.println("=== Course Menu ===");
        System.out.print("Enter course id: ");
        String id = scanner.nextLine();
        System.out.print("Enter course title: ");
        String title = scanner.nextLine();
        System.out.print("Enter instructor id: ");
        String instructorId = scanner.nextLine();

        Course course = new Course(id, title, "Course description", instructorId, "General", 0.0, true);
        System.out.println("Course created: " + course.getTitle());
    }
}
