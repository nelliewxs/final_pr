package com.propertymanager;

public class Apartment extends Property {
    private int floor;

    public Apartment(int id, String title, double price, int floor) {
        super(id, title, price);
        this.floor = floor;
    }

    @Override
    public void display() {
        System.out.println("[Apartment] ID: " + getId() +
                " | " + getTitle() +
                " | $" + getPrice() +
                " | Floor: " + floor);
    }
    public int getFloor() {
        return floor;
    }
}