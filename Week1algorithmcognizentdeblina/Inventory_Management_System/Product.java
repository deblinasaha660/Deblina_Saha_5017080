package Inventory_Management_System;


public class Product {
    private String pId;
    private String pName;
    private int q;
    private double price;

    public Product(String pId, String pName, int q, double price) {
        this.pId = pId;
        this.pName = pName;
        this.q = q;
        this.price = price;
    }

    public String getProductId() { return pId; }
    public String getProductName() { return pName; }
    public int getQuantity() { return q; }
    public void setQuantity(int q) { this.q = q; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "Product{id='" + pId + "', name='" + pName + "', quantity=" + q + ", price=" + price + "}";
    }

}


