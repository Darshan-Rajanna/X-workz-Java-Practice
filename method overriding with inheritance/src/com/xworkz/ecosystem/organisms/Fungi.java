package com.xworkz.ecosystem.organisms;

public class Fungi extends Organism {

    public Fungi(String name, String habitat) {
        super(name, habitat, true, "Asexual/Sexual", "Saprophytic");
    }

    @Override
    public void grow() {
        System.out.println(name + " the fungus is growing through hyphal extension.");
    }

    @Override
    public void reproduce() {
        System.out.println(name + " reproduces asexually or sexually through spores.");
    }

    @Override
    public void respire() {
        System.out.println(name + " respires aerobically or anaerobically depending on the environment.");
    }

    @Override
    public void respondToStimuli() {
        System.out.println(name + " responds to moisture, temperature, and nutrient availability.");
    }

    @Override
    public void obtainNutrition() {
        System.out.println(name + " absorbs decomposed organic matter from its surroundings.");
    }

    // Additional behaviors unique to Fungi class
    protected void decomposeOrganicMatter() {
        System.out.println(name + " is decomposing dead plants and animals.");
    }

    protected void formMyceliumNetwork() {
        System.out.println(name + " is forming an underground mycelium network.");
    }

    protected void produceSpores() {
        System.out.println(name + " is producing microscopic spores for reproduction.");
    }

    protected void absorbWaterAndNutrients() {
        System.out.println(name + " is absorbing water and nutrients through its hyphae.");
    }

    protected void formMutualisticRelationships() {
        System.out.println(name + " is forming mutualistic relationships, such as mycorrhiza with plants.");
    }
}
