package org.example.view;

import org.example.controller.UserController;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserView view = new UserView();
        UserController controller = new UserController(view);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add User");
            System.out.println("2. View User by ID");
            System.out.println("3. List Users");
            System.out.println("4. Search User by Name");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    controller.addUser(name, age);
                    break;
                case 2:
                    System.out.print("Enter user ID to view: ");
                    int index = scanner.nextInt();
                    controller.viewUser(index);
                    break;
                case 3:
                    controller.listUsers();
                    break;
                case 4:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.next();
                    List<Integer> matchingIndices = controller.searchUsersByName(searchName);
                    if (!matchingIndices.isEmpty()) {
                        System.out.print("Enter the ID of the user you want to view: ");
                        int chosenIndex = scanner.nextInt();
                        if (matchingIndices.contains(chosenIndex)) {
                            controller.viewUser(chosenIndex);
                        } else {
                            System.out.println("Invalid ID selected.");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
