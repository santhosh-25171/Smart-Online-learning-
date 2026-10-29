package com.learning.cli;

import com.learning.model.Payment;
import java.time.LocalDateTime;
import java.util.Scanner;

public class PaymentCLI {
    public void showMenu() {
        showMenu(new Scanner(System.in));
    }

    public void showMenu(Scanner scanner) {
        System.out.println("=== Payment Menu ===");
        System.out.print("Enter payment id: ");
        String id = scanner.nextLine();
        System.out.print("Enter student id: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter course id: ");
        String courseId = scanner.nextLine();

        Payment payment = new Payment(id, studentId, courseId, 100.0, "CARD", "PAID", LocalDateTime.now());
        System.out.println("Payment processed: " + payment.getPaymentId());
    }
}
