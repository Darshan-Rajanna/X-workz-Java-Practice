package com.xworkz.ecosystem.fungi;

import com.xworkz.ecosystem.organisms.Fungi;

public class Mushroom extends Fungi {
    public Mushroom(String name, String habitat) {
        super("Mushroom", "Soil and woodlands");
    }

    @Override
    protected void decomposeOrganicMatter() {
        System.out.println(name + " breaks down organic waste in forests.");
    }

    @Override
    protected void formMyceliumNetwork() {
        System.out.println(name + " forms an extensive underground mycelium.");
    }

    @Override
    protected void produceSpores() {
        System.out.println(name + " releases spores from gills under its cap.");
    }

    @Override
    protected void absorbWaterAndNutrients() {
        System.out.println(name + " absorbs water and nutrients via hyphae.");
    }

    @Override
    protected void formMutualisticRelationships() {
        System.out.println(name + " may form mycorrhizal relationships with plants.");
    }
}
