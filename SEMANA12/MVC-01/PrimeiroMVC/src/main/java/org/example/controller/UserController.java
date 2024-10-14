package org.example.controller;

import org.example.model.User;
import org.example.view.UserView;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    private List<User> users = new ArrayList<>();
    private UserView view;

    public UserController(UserView view) {
        this.view = view;
    }

    public void addUser(String name, int age) {
        User newUser = new User(name, age);
        users.add(newUser);
        System.out.println("User added successfully!");
    }

    public void listUsers() {
        view.printAllUsers(users);
    }

    public void viewUser(int index) {
        if (index < 0 || index >= users.size()) {
            System.out.println("User not found.");
        } else {
            view.printUserDetails(users.get(index));
        }
    }

    public List<Integer> searchUsersByName(String name) {
        List<Integer> matchingIndices = new ArrayList<>();
        System.out.println("\n-- Search Results --");
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println("ID: " + i + " -> " + users.get(i));
                matchingIndices.add(i);
            }
        }
        if (matchingIndices.isEmpty()) {
            System.out.println("No users found with the name: " + name);
        }
        return matchingIndices;
    }
}
