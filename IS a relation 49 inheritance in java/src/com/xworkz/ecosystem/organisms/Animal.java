package com.xworkz.ecosystem.organisms;

public class Animal extends Organism {
    public Animal(String name, String habitat) {
        super(name, habitat, true, "Sexual", "Heterotrophic");
    }

    public void move() {
        System.out.println(name + " is moving in " + habitat + ".");
    }

    public void communicate() {
        System.out.println(name + " is communicating with others.");
    }

    public void huntOrGraze() {
        System.out.println(name + " is either hunting or grazing for food.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void defend() {
        System.out.println(name + " is defending itself from threats.");
    }
}

