package com.xworkz.projector.components;

public class Len {
    String type;
    int focalLength;

    public Len(String type, int focalLength) {
        this.type = type;
        this.focalLength = focalLength;
    }

    public void displayInfo() {
        System.out.println("Lens Type: " + type + ", Focal Length: " + focalLength);
    }
}