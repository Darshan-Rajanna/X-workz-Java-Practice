package com.xworkz.ecosystem.fungi;

import com.xworkz.ecosystem.organisms.Fungi;

public class Shiitake extends Fungi {
    public Shiitake(String name, String habitat) {
        super("Shiitake", "Hardwood trees");
    }

    @Override
    protected void decomposeOrganicMatter() {
        System.out.println(name + " breaks down lignin in wood.");
    }

    @Override
    protected void formMyceliumNetwork() {
        System.out.println(name + " creates thick mycelium in logs.");
    }

    @Override
    protected void produceSpores() {
        System.out.println(name + " releases spores from its dark brown gills.");
    }

    @Override
    protected void absorbWaterAndNutrients() {
        System.out.println(name + " absorbs nutrients from hardwood.");
    }

    @Override
    protected void formMutualisticRelationships() {
        System.out.println(name + " is typically saprophytic, not mutualistic.");
    }
}
