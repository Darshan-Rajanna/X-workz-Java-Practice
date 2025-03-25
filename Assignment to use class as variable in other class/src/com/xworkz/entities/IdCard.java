package com.xworkz.entities;

public class IdCard {
    private String material;
    private String[] colors;
    private double weight;
    private String designedBy;

    public IdCard(String material, String[] colors, double weight, String designedBy) {
        this.material = material;
        this.colors = colors;
        this.weight = weight;
        this.designedBy = designedBy;
    }

    public IdCard(String material, double weight) {
        this.material = material;
        this.colors = new String[]{"Unknown"};
        this.weight = weight;
        this.designedBy = "Unknown";
    }

    public String displayIdCard() {
        return "ID Card: Material=" + material + ", Colors=" + String.join(",", colors) + ", Weight=" + weight + ", Designed By=" + designedBy;
    }
}
