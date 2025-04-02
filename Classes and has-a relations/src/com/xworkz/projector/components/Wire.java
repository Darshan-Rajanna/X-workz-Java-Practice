package com.xworkz.projector.components;

public class Wire {
    String material;
    int length;

    public Wire(String material, int length) {
        this.material = material;
        this.length = length;
    }

    public void displayInfo() {
        System.out.println("Wire Material: " + material + ", Length: " + length + "m");
    }
}