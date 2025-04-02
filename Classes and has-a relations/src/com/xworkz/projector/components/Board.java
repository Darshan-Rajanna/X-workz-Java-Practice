package com.xworkz.projector.components;

public class Board {
    String model;
    String manufacturer;

    public Board(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public void displayInfo() {
        System.out.println("Board Model: " + model + ", Manufacturer: " + manufacturer);
    }
}