package org.example.view;

import org.example.model.User;

import java.util.List;

public class UserView {

    public void printUserDetails(User user) {
        System.out.println("User: ");
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
    }

    public void printAllUsers(List<User> users) {
        System.out.println("\n-- User List --");
        for (User user : users) {
            System.out.println(user);
        }
    }
}

