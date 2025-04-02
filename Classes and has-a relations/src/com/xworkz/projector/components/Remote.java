package com.xworkz.projector.components;

public class Remote {
    String brand;
    int buttons;

    public Remote(String brand, int buttons) {
        this.brand = brand;
        this.buttons = buttons;
    }

    public void displayInfo() {
        System.out.println("Remote Brand: " + brand + ", Buttons: " + buttons);
    }
}
