package com.xworkz.projector.components;

public class Screw {
    int size;
    String material;

    public Screw(int size, String material) {
        this.size = size;
        this.material = material;
    }

    public void displayInfo() {
        System.out.println("Screw Size: " + size + "mm, Material: " + material);
    }
}