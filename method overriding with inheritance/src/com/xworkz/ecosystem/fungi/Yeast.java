package com.xworkz.ecosystem.fungi;

import com.xworkz.ecosystem.organisms.Fungi;

public class Yeast extends Fungi {
    public Yeast(String name, String habitat) {
        super("Yeast", "Moist, sugary environments");
    }

    @Override
    protected void decomposeOrganicMatter() {
        System.out.println(name + " ferments sugars into alcohol and carbon dioxide.");
    }

    @Override
    protected void formMyceliumNetwork() {
        System.out.println(name + " does not form typical mycelium like filamentous fungi.");
    }

    @Override
    protected void produceSpores() {
        System.out.println(name + " reproduces asexually by budding, or forms spores.");
    }

    @Override
    protected void absorbWaterAndNutrients() {
        System.out.println(name + " absorbs sugars and moisture from its environment.");
    }

    @Override
    protected void formMutualisticRelationships() {
        System.out.println(name + " forms symbiotic relationships in fermented food production.");
    }
}
