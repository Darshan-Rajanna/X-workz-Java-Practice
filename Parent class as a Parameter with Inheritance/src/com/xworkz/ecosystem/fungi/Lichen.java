package com.xworkz.ecosystem.fungi;

import com.xworkz.ecosystem.organisms.Fungi;

public class Lichen extends Fungi {
    public Lichen(String name, String habitat) {
        super("Lichen", "Rocks and Tree Bark");
    }

    @Override
    protected void decomposeOrganicMatter() {
        System.out.println(name + " breaks down surfaces it grows on.");
    }

    @Override
    protected void formMyceliumNetwork() {
        System.out.println(name + " forms a compact thallus structure.");
    }

    @Override
    protected void produceSpores() {
        System.out.println(name + " reproduces through fungal spores and algal cells.");
    }

    @Override
    protected void absorbWaterAndNutrients() {
        System.out.println(name + " absorbs moisture from the air.");
    }

    @Override
    protected void formMutualisticRelationships() {
        System.out.println(name + " forms mutualistic relationships with algae or cyanobacteria.");
    }
}
