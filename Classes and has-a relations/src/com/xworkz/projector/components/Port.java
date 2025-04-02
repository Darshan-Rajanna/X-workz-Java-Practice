package com.xworkz.projector.components;

public class Port {
    String type;
    int count;

    public Port(String type, int count) {
        this.type = type;
        this.count = count;
    }

    public void displayInfo() {
        System.out.println("Port Type: " + type + ", Count: " + count);
    }
}