package com.propertymanager;

public class House extends Property {
    private int rooms;

    public House(int id, String title, double price, int rooms) {
        super(id, title, price);
        this.rooms = rooms;
    }

    // Polymorphism (override)
    @Override
    public void display() {
        System.out.println("[House] ID: " + getId() +
                " | " + getTitle() +
                " | $" + getPrice() +
                " | Rooms: " + rooms);
    }
    public int getRooms() {
        return rooms;
    }
}