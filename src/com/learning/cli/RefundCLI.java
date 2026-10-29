package com.learning.cli;

import com.learning.model.Refund;
import java.time.LocalDateTime;
import java.util.Scanner;

public class RefundCLI {
    public void showMenu() {
        showMenu(new Scanner(System.in));
    }

    public void showMenu(Scanner scanner) {
        System.out.println("=== Refund Menu ===");
        System.out.print("Enter refund id: ");
        String refundId = scanner.nextLine();
        System.out.print("Enter student id: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter payment id: ");
        String paymentId = scanner.nextLine();

        Refund refund = new Refund(refundId, paymentId, studentId, 50.0, "Course not satisfied", "PENDING", LocalDateTime.now());
        System.out.println("Refund requested: " + refund.getRefundId());
    }
}
