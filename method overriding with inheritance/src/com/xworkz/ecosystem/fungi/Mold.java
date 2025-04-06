package com.xworkz.ecosystem.fungi;

import com.xworkz.ecosystem.organisms.Fungi;

public class Mold extends Fungi {
    public Mold(String name, String habitat) {
        super("Mold", "Damp surfaces");
    }

    @Override
    protected void decomposeOrganicMatter() {
        System.out.println(name + " breaks down damp and decaying food.");
    }

    @Override
    protected void formMyceliumNetwork() {
        System.out.println(name + " grows rapidly forming a fuzzy network.");
    }

    @Override
    protected void produceSpores() {
        System.out.println(name + " produces lightweight spores for dispersal.");
    }

    @Override
    protected void absorbWaterAndNutrients() {
        System.out.println(name + " absorbs nutrients from decomposing food.");
    }

    @Override
    protected void formMutualisticRelationships() {
        System.out.println(name + " rarely forms mutualistic relationships.");
    }
}
