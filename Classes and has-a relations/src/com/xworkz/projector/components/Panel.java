package com.xworkz.projector.components;

public class Panel {
    String type;
    int resolution;

    public Panel(String type, int resolution) {
        this.type = type;
        this.resolution = resolution;
    }

    public void displayInfo() {
        System.out.println("Panel Type: " + type + ", Resolution: " + resolution + "p");
    }
}