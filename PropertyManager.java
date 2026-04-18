package com.propertymanager;

import java.util.ArrayList;

public class PropertyManager {

    private ArrayList<Property> properties;

    public PropertyManager() {
        properties = new ArrayList<>();
    }

    // CREATE
    public void addProperty(Property property) {
        properties.add(property);
        System.out.println("Property added successfully!");
    }

    // READ
    public void viewProperties() {
        if (properties.isEmpty()) {
            System.out.println("No properties found.");
            return;
        }

        for (Property p : properties) {
            p.display(); // polymorphism here
        }
    }

    // DELETE
    public void deleteProperty(int id) {
        Property toRemove = null;

        for (Property p : properties) {
            if (p.getId() == id) {
                toRemove = p;
                break;
            }
        }

        if (toRemove != null) {
            properties.remove(toRemove);
            System.out.println("Property deleted.");
        } else {
            System.out.println("Property not found.");
        }
    }

    // UPDATE
   public void updateProperty(int id, double newPrice) {

    if (newPrice <= 0) {
        System.out.println("Price must be positive!");
        return;
    }

    for (Property p : properties) {
        if (p.getId() == id) {
            p.setPrice(newPrice);
            System.out.println("Property updated.");
            return;
        }
    }

    System.out.println("Property not found.");
}
    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }
   public boolean idExists(int id) {
    for (Property p : properties) {
        if (p.getId() == id) {
            return true;
        }
    }
    return false;
}
    public void sortByPrice() {
    properties.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));

    System.out.println("\n=== Properties Sorted by Price ===");
    viewProperties();
}
}
