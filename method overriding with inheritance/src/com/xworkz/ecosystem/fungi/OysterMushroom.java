package com.xworkz.ecosystem.fungi;

import com.xworkz.ecosystem.organisms.Fungi;

public class OysterMushroom extends Fungi {
    public OysterMushroom(String name, String habitat) {
        super("Oyster Mushroom", "Dead logs and tree trunks");
    }

    @Override
    protected void decomposeOrganicMatter() {
        System.out.println(name + " decomposes dead wood effectively.");
    }

    @Override
    protected void formMyceliumNetwork() {
        System.out.println(name + " spreads through wood via its mycelium.");
    }

    @Override
    protected void produceSpores() {
        System.out.println(name + " releases white spores from its gills.");
    }

    @Override
    protected void absorbWaterAndNutrients() {
        System.out.println(name + " absorbs from decaying hardwood.");
    }

    @Override
    protected void formMutualisticRelationships() {
        System.out.println(name + " may form beneficial associations with trees.");
    }
}
