package com.propertymanager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PropertyManager manager = new PropertyManager();

        manager.setProperties(FileHandler.loadFromFile());

        while (true) {
            System.out.println("\n=== Property Manager ===");
            System.out.println("1. Add Property");
            System.out.println("2. View Properties");
            System.out.println("3. Update Property");
            System.out.println("4. Delete Property");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice;

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input!");
                continue;
            }

            switch (choice) {

                case 1:
                    addProperty(scanner, manager);
                    break;

                case 2:
                    manager.viewProperties();
                    break;

                case 3:
                    updateProperty(scanner, manager);
                    break;

                case 4:
                    deleteProperty(scanner, manager);
                    break;

                case 5:
                    FileHandler.saveToFile(manager.getProperties());
                    System.out.println("Data saved. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // 🔹 ADD PROPERTY
    private static void addProperty(Scanner scanner, PropertyManager manager) {
    try {
        System.out.print("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        if (manager.idExists(id)) {
            System.out.println("Property with this ID already exists!");
            return;
        }

        System.out.print("Enter title: ");
        String title = scanner.nextLine();

        if (title.trim().isEmpty()) {
            System.out.println("Title cannot be empty!");
            return;
        }

        System.out.print("Enter price: ");
        double price = Double.parseDouble(scanner.nextLine());

        if (price <= 0) {
            System.out.println("Price must be positive!");
            return;
        }

        System.out.println("Choose type: 1-House, 2-Apartment");
        int type = Integer.parseInt(scanner.nextLine());

        if (type == 1) {
            System.out.print("Enter number of rooms: ");
            int rooms = Integer.parseInt(scanner.nextLine());

            if (rooms <= 0) {
                System.out.println("Rooms must be positive!");
                return;
            }

            manager.addProperty(new House(id, title, price, rooms));

        } else if (type == 2) {
            System.out.print("Enter floor: ");
            int floor = Integer.parseInt(scanner.nextLine());

            manager.addProperty(new Apartment(id, title, price, floor));

        } else {
            System.out.println("Invalid type!");
        }

    } catch (NumberFormatException e) {
        System.out.println("Please enter correct numeric values!");
    } catch (Exception e) {
        System.out.println("Unexpected error occurred.");
    }
}

    // 🔹 UPDATE
    private static void updateProperty(Scanner scanner, PropertyManager manager) {
        try {
            System.out.print("Enter ID: ");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter new price: ");
            double price = Double.parseDouble(scanner.nextLine());

            manager.updateProperty(id, price);

        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }

    // 🔹 DELETE
    private static void deleteProperty(Scanner scanner, PropertyManager manager) {
        try {
            System.out.print("Enter ID: ");
            int id = Integer.parseInt(scanner.nextLine());

            manager.deleteProperty(id);

        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }
}
