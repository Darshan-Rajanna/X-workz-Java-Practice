package com.xworkz.ecosystem.fungi;

import com.xworkz.ecosystem.organisms.Fungi;

public class PuffballMushroom extends Fungi {
    public PuffballMushroom(String name, String habitat) {
        super("Puffball Mushroom", "Meadows and forests");
    }

    @Override
    protected void decomposeOrganicMatter() {
        System.out.println(name + " helps in breaking down decaying vegetation.");
    }

    @Override
    protected void formMyceliumNetwork() {
        System.out.println(name + " spreads a fine network under soil.");
    }

    @Override
    protected void produceSpores() {
        System.out.println(name + " releases spores when the outer layer bursts.");
    }

    @Override
    protected void absorbWaterAndNutrients() {
        System.out.println(name + " absorbs nutrients through decaying matter.");
    }

    @Override
    protected void formMutualisticRelationships() {
        System.out.println(name + " occasionally associates with grasses.");
    }
}
