package com.propertymanager;

import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    private static final String FILE_NAME = "data.txt";

    // SAVE
    public static void saveToFile(ArrayList<Property> properties) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {

            for (Property p : properties) {
                if (p instanceof House) {
                    House h = (House) p;
                    writer.write("House," + h.getId() + "," + h.getTitle() + "," + h.getPrice() + "," + h.getRooms());
                } else if (p instanceof Apartment) {
                    Apartment a = (Apartment) p;
                    writer.write("Apartment," + a.getId() + "," + a.getTitle() + "," + a.getPrice() + "," + a.getFloor());
                }
                writer.newLine();
            }

            System.out.println("Data saved!");

        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }

    // LOAD
    public static ArrayList<Property> loadFromFile() {
        ArrayList<Property> properties = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                String type = parts[0];
                int id = Integer.parseInt(parts[1]);
                String title = parts[2];
                double price = Double.parseDouble(parts[3]);

                if (type.equals("House")) {
                    int rooms = Integer.parseInt(parts[4]);
                    properties.add(new House(id, title, price, rooms));

                } else if (type.equals("Apartment")) {
                    int floor = Integer.parseInt(parts[4]);
                    properties.add(new Apartment(id, title, price, floor));
                }
            }

        } catch (IOException e) {
            System.out.println("No saved data found.");
        }

        return properties;
    }
}