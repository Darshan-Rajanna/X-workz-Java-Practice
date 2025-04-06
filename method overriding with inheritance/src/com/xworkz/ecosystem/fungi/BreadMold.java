package com.xworkz.ecosystem.fungi;

import com.xworkz.ecosystem.organisms.Fungi;

public class BreadMold extends Fungi {

    public BreadMold(String name, String habitat) {
        super("Bread Mold", "Stale bread and damp organic surfaces");
    }

    @Override
    public void grow() {
        System.out.println(name + " spreads across bread by extending hyphae.");
    }

    @Override
    public void reproduce() {
        System.out.println(name + " reproduces using sporangia that release spores.");
    }

    @Override
    public void respire() {
        System.out.println(name + " respires anaerobically in moist, oxygen-poor environments.");
    }

    @Override
    public void respondToStimuli() {
        System.out.println(name + " responds to moisture and nutrient availability.");
    }

    @Override
    public void obtainNutrition() {
        System.out.println(name + " obtains nutrition by secreting enzymes and absorbing nutrients.");
    }

    // Overriding all protected methods of Fungi class
    @Override
    protected void decomposeOrganicMatter() {
        System.out.println(name + " decomposes starch-rich substances like bread.");
    }

    @Override
    protected void formMyceliumNetwork() {
        System.out.println(name + " forms a dense network of mycelium on the surface.");
    }

    @Override
    protected void produceSpores() {
        System.out.println(name + " produces black spores on tall stalks.");
    }

    @Override
    protected void absorbWaterAndNutrients() {
        System.out.println(name + " absorbs nutrients from decaying bread using hyphae.");
    }

    @Override
    protected void formMutualisticRelationships() {
        System.out.println(name + " rarely forms mutualistic relationships, mostly acts as a decomposer.");
    }
}
