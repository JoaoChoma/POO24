package org.example;

import org.example.controller.ProductController;
import org.example.view.ProductView;

public class Main {
    public static void main(String[] args) {
        ProductView view = new ProductView();
        ProductController controller = new ProductController(view);

        while (true) {
            int choice = view.showMainMenu();

            switch (choice) {
                case 1:
                    controller.createProduct();
                    break;
                case 2:
                    controller.viewProductById();
                    break;
                case 3:
                    controller.listAllProducts();
                    break;
                case 4:
                    controller.updateProduct();
                    break;
                case 5:
                    controller.deleteProduct();
                    break;
                case 6:
                    view.printMessage("Exiting...");
                    System.exit(0);
                    break;
                default:
                    view.printMessage("Invalid option.");
            }
        }
    }
}
