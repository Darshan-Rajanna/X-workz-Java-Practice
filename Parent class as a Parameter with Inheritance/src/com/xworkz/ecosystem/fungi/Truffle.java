package com.xworkz.ecosystem.fungi;

import com.xworkz.ecosystem.organisms.Fungi;

public class Truffle extends Fungi {
    public Truffle(String name, String habitat) {
        super("Truffle", "Underground near tree roots");
    }

    @Override
    protected void decomposeOrganicMatter() {
        System.out.println(name + " breaks down materials underground.");
    }

    @Override
    protected void formMyceliumNetwork() {
        System.out.println(name + " forms a network near tree roots.");
    }

    @Override
    protected void produceSpores() {
        System.out.println(name + " produces spores inside a fruiting body.");
    }

    @Override
    protected void absorbWaterAndNutrients() {
        System.out.println(name + " absorbs from soil and tree root associations.");
    }

    @Override
    protected void formMutualisticRelationships() {
        System.out.println(name + " forms strong mutualistic bonds with oak and hazelnut trees.");
    }
}
