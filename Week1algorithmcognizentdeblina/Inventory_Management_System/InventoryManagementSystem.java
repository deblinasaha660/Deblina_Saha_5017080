package Inventory_Management_System;

import java.util.HashMap;
import java.util.Map;

public class InventoryManagementSystem {
    private Map<String, Product> inventory;

    public InventoryManagementSystem() {
        this.inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(String pId, int newQuantity, double newPrice) {
        Product product = inventory.get(pId);
        if (product != null) {
            product.setQuantity(newQuantity);
            product.setPrice(newPrice);
        } else {
            System.out.println("Product not found");
        }
    }

    public void deleteProduct(String pId) {
        if (inventory.remove(pId) == null) {
            System.out.println("Product not found");
        }
    }

    public Product getProduct(String pId) {
        return inventory.get(pId);
    }

    public void displayInventory() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        // Adding products
        ims.addProduct(new Product("P001", "Table", 10, 999.99));
        ims.addProduct(new Product("P002", "Chair", 20, 499.99));
        ims.addProduct(new Product("P003", "Sofa", 15, 299.99));

        System.out.println("Initial Inventory:");
        ims.displayInventory();

        // Updating a product
        ims.updateProduct("P001", 8, 1099.99);

        // Deleting a product
        ims.deleteProduct("P002");

        System.out.println("\nUpdated Inventory:");
        ims.displayInventory();


        Product product = ims.getProduct("P003");
        System.out.println("\nRetrieved Product: " + product);
    }


}