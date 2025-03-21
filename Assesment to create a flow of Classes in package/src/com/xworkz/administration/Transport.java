package com.xworkz.administration;

public class Transport {
    private String type;

    public Transport(String type) {
        this.type = type;
    }

    public void display() {
        System.out.println("Transport: " + type);
    }
}
