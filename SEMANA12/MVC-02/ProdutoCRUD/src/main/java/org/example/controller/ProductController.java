package org.example.controller;

import org.example.model.Product;
import org.example.view.ProductView;

import java.util.ArrayList;
import java.util.List;

public class ProductController {
    private List<Product> products = new ArrayList<>();
    private ProductView view;

    public ProductController(ProductView view) {
        this.view = view;
    }

    public void createProduct() {
        int id = view.getProductId();
        String name = view.getProductName();
        double price = view.getProductPrice();
        Product newProduct = new Product(id, name, price);
        products.add(newProduct);
        view.printMessage("Product added successfully!");
    }

    public void viewProductById() {
        int id = view.getProductId();
        Product product = findProductById(id);
        if (product != null) {
            view.printProductDetails(product.getId(), product.getName(), product.getPrice());
        } else {
            view.printMessage("Product not found.");
        }
    }

    public void listAllProducts() {
        if (products.isEmpty()) {
            view.printMessage("No products found.");
        } else {
            for (Product product : products) {
                view.printProductDetails(product.getId(), product.getName(), product.getPrice());
            }
        }
    }

    public void updateProduct() {
        int id = view.getProductId();
        Product product = findProductById(id);
        if (product != null) {
            String newName = view.getProductName();
            double newPrice = view.getProductPrice();
            product.setName(newName);
            product.setPrice(newPrice);
            view.printMessage("Product updated successfully!");
        } else {
            view.printMessage("Product not found.");
        }
    }

    public void deleteProduct() {
        int id = view.getProductId();
        Product product = findProductById(id);
        if (product != null) {
            products.remove(product);
            view.printMessage("Product deleted successfully!");
        } else {
            view.printMessage("Product not found.");
        }
    }

    private Product findProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}

