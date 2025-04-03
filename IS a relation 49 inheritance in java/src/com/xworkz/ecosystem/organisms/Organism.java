package com.xworkz.ecosystem.organisms;

// Base class Organism
public class Organism {
    protected String name;
    protected String habitat;
    protected boolean isMulticellular;
    protected String reproductionType;
    protected String nutritionType;

    public Organism(String name, String habitat, boolean isMulticellular, String reproductionType, String nutritionType) {
        this.name = name;
        this.habitat = habitat;
        this.isMulticellular = isMulticellular;
        this.reproductionType = reproductionType;
        this.nutritionType = nutritionType;
    }

    public void grow() {
        System.out.println(name + " is growing.");
    }

    public void reproduce() {
        System.out.println(name + " is reproducing through " + reproductionType + ".");
    }

    public void respire() {
        System.out.println(name + " is respiring.");
    }

    public void respondToStimuli() {
        System.out.println(name + " is responding to environmental stimuli.");
    }

    public void obtainNutrition() {
        System.out.println(name + " is obtaining nutrition via " + nutritionType + ".");
    }
}