package com.xworkz.ecosystem.fungi;

import com.xworkz.ecosystem.organisms.Fungi;

public class DeathCap extends Fungi {
    public DeathCap(String name, String habitat) {
        super("DeathCap", "Forests");
    }

    @Override
    protected void decomposeOrganicMatter() {
        System.out.println(name + " decomposes organic matter in forest litter.");
    }

    @Override
    protected void formMyceliumNetwork() {
        System.out.println(name + " forms a dense mycelium underground.");
    }

    @Override
    protected void produceSpores() {
        System.out.println(name + " produces deadly spores for reproduction.");
    }

    @Override
    protected void absorbWaterAndNutrients() {
        System.out.println(name + " absorbs water and nutrients through roots.");
    }

    @Override
    protected void formMutualisticRelationships() {
        System.out.println(name + " forms symbiotic relationships with tree roots.");
    }
}
