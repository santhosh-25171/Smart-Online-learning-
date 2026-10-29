package com.learning.cli;

import com.learning.model.User;
import java.util.Scanner;

public class UserCLI {
    public void showMenu() {
        showMenu(new Scanner(System.in));
    }

    public void showMenu(Scanner scanner) {
        System.out.println("=== User Menu ===");
        System.out.print("Enter user id: ");
        String id = scanner.nextLine();
        System.out.print("Enter user name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        User user = new User(id, name, email);
        System.out.println("User created: " + user.getName());
    }
}
