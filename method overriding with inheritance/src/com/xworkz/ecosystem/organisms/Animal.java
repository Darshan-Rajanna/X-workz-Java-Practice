package com.xworkz.ecosystem.organisms;

public class Animal extends Organism {

    public Animal(String name, String habitat) {
        super(name, habitat, true, "Sexual", "Heterotrophic");
    }

    @Override
    public void grow() {
        System.out.println(name + " the animal is growing from a baby to adult.");
    }

    @Override
    public void reproduce() {
        System.out.println(name + " reproduces sexually in the " + habitat + ".");
    }

    @Override
    public void respire() {
        System.out.println(name + " is respiring using lungs or gills.");
    }

    @Override
    public void respondToStimuli() {
        System.out.println(name + " quickly reacts to sounds and movements.");
    }

    @Override
    public void obtainNutrition() {
        System.out.println(name + " obtains nutrition by consuming other organisms.");
    }

    // Additional behaviors unique to Animal class
    protected void move() {
        System.out.println(name + " is moving in " + habitat + ".");
    }

    protected void communicate() {
        System.out.println(name + " is communicating with others.");
    }

    protected void huntOrGraze() {
        System.out.println(name + " is either hunting or grazing for food.");
    }

    protected void sleep() {
        System.out.println(name + " is sleeping.");
    }

    protected void defend() {
        System.out.println(name + " is defending itself from threats.");
    }
}
