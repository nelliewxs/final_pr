package com.propertymanager;

public class Property {
    private int id;
    private String title;
    private double price;

    public Property(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    // Getter
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    // Setter
    public void setPrice(double price) {
        this.price = price;
    }

    // Method (will be overridden)
    public void display() {
        System.out.println("ID: " + id + " | " + title + " | $" + price);
    }
}