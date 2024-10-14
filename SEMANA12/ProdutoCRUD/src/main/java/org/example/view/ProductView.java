package org.example.view;

import java.util.Scanner;

public class ProductView {
    private Scanner scanner = new Scanner(System.in);

    public int showMainMenu() {
        System.out.println("\n1. Create Product");
        System.out.println("2. View Product by ID");
        System.out.println("3. List All Products");
        System.out.println("4. Update Product");
        System.out.println("5. Delete Product");
        System.out.println("6. Exit");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    public int getProductId() {
        System.out.print("Enter Product ID: ");
        return scanner.nextInt();
    }

    public String getProductName() {
        System.out.print("Enter Product Name: ");
        return scanner.next();
    }

    public double getProductPrice() {
        System.out.print("Enter Product Price: ");
        return scanner.nextDouble();
    }

    public void printProductDetails(int id, String name, double price) {
        System.out.println("Product [ID=" + id + ", Name=" + name + ", Price=" + price + "]");
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
