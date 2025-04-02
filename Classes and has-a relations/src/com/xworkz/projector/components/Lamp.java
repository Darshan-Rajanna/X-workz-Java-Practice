package com.xworkz.projector.components;

public class Lamp {
    int wattage;
    String lifespan;

    public Lamp(int wattage, String lifespan) {
        this.wattage = wattage;
        this.lifespan = lifespan;
    }

    public void displayInfo() {
        System.out.println("Lamp Wattage: " + wattage + "W, Lifespan: " + lifespan);
    }
}