package com.xworkz.entities;

public class Satellite {
    public enum Type { COMMUNICATION, WEATHER, MILITARY, SCIENTIFIC }

    private Type type;
    private double cost;
    private double weight;
    private double loadCapacity;

    public Satellite(Type type, double cost, double weight, double loadCapacity) {
        this.type = type;
        this.cost = cost;
        this.weight = weight;
        this.loadCapacity = loadCapacity;
    }

    public Satellite(Type type, double cost) {
        this.type = type;
        this.cost = cost;
        this.weight = 0;
        this.loadCapacity = 0;
    }

    public Type getType() { return type; }
    public void setType(Type type) { this.type = type; }

    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public double getLoadCapacity() { return loadCapacity; }
    public void setLoadCapacity(double loadCapacity) { this.loadCapacity = loadCapacity; }

    public String displaySatellite() {
        return "Satellite: Type=" + type + ", Cost=" + cost + ", Weight=" + weight + ", Load Capacity=" + loadCapacity;
    }
}
