package com.xworkz.ecosystem.organisms;

public class Fungi extends Organism {
    public Fungi(String name, String habitat) {
        super(name, habitat, true, "Asexual/Sexual", "Saprophytic");
    }

    public void decompose() {
        System.out.println(name + " is decomposing organic material.");
    }

    public void reproduceBySpores() {
        System.out.println(name + " is reproducing through spores.");
    }

    public void absorbNutrients() {
        System.out.println(name + " is absorbing nutrients from its surroundings.");
    }

    public void formSymbioticRelationships() {
        System.out.println(name + " is forming symbiotic relationships with plants or other organisms.");
    }

    public void growInColonies() {
        System.out.println(name + " is growing in colonies.");
    }
}
