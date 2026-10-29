package com.learning;

import com.learning.cli.CertificateCLI;
import com.learning.cli.CourseCLI;
import com.learning.cli.EnrollmentCLI;
import com.learning.cli.LearningProgressCLI;
import com.learning.cli.PaymentCLI;
import com.learning.cli.RefundCLI;
import com.learning.cli.ReviewCLI;
import com.learning.cli.UserCLI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            printMenu();
            if (!scanner.hasNextLine()) {
                break;
            }

            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1":
                    new UserCLI().showMenu(scanner);
                    break;
                case "2":
                    new CourseCLI().showMenu(scanner);
                    break;
                case "3":
                    new EnrollmentCLI().showMenu(scanner);
                    break;
                case "4":
                    new LearningProgressCLI().showMenu(scanner);
                    break;
                case "5":
                    new PaymentCLI().showMenu(scanner);
                    break;
                case "6":
                    new RefundCLI().showMenu(scanner);
                    break;
                case "7":
                    new ReviewCLI().showMenu(scanner);
                    break;
                case "8":
                    new CertificateCLI().showMenu(scanner);
                    break;
                case "0":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please choose from 0 to 8.");
            }
        }

        System.out.println("Goodbye.");
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("=== Smart Online Learning ===");
        System.out.println("1. Users");
        System.out.println("2. Courses");
        System.out.println("3. Enrollments");
        System.out.println("4. Learning progress");
        System.out.println("5. Payments");
        System.out.println("6. Refunds");
        System.out.println("7. Reviews");
        System.out.println("8. Certificates");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }
}
