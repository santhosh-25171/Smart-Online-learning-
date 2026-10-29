package com.learning.cli;

import com.learning.model.Certificate;
import java.time.LocalDate;
import java.util.Scanner;

public class CertificateCLI {
    public void showMenu() {
        showMenu(new Scanner(System.in));
    }

    public void showMenu(Scanner scanner) {
        System.out.println("=== Certificate Menu ===");
        System.out.print("Enter certificate id: ");
        String certificateId = scanner.nextLine();
        System.out.print("Enter student id: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter course id: ");
        String courseId = scanner.nextLine();

        Certificate certificate = new Certificate(certificateId, studentId, courseId, LocalDate.now(), "CERT-1001", "ISSUED");
        System.out.println("Certificate issued: " + certificate.getCertificateId());
    }
}
