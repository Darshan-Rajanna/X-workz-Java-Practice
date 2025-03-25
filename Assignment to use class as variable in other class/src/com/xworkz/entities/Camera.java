package com.xworkz.entities;

public class Camera {
    public enum Type { DSLR, MIRRORLESS, ACTION, SECURITY }

    private String brand;
    private double price;
    private Type type;
    private String connectivity;

    public Camera(String brand, double price, Type type, String connectivity) {
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.connectivity = connectivity;
    }

    public Camera(String brand, double price) {
        this.brand = brand;
        this.price = price;
        this.type = Type.DSLR;
        this.connectivity = "Unknown";
    }

    public String displayCamera() {
        return "Camera: Brand=" + brand + ", Price=" + price + ", Type=" + type + ", Connectivity=" + connectivity;
    }
}

