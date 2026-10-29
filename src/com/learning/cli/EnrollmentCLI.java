package com.learning.cli;

import com.learning.model.Enrollment;
import java.time.LocalDate;
import java.util.Scanner;

public class EnrollmentCLI {
    public void showMenu() {
        showMenu(new Scanner(System.in));
    }

    public void showMenu(Scanner scanner) {
        System.out.println("=== Enrollment Menu ===");
        System.out.print("Enter enrollment id: ");
        String id = scanner.nextLine();
        System.out.print("Enter student id: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter course id: ");
        String courseId = scanner.nextLine();

        Enrollment enrollment = new Enrollment(id, studentId, courseId, "ACTIVE", LocalDate.now());
        System.out.println("Enrollment created for student: " + enrollment.getStudentId());
    }
}
