package com.xworkz.ecosystem.organisms;
import com.xworkz.ecosystem.organisms.Organism;

public class Microbial extends Organism {

    public Microbial(String name, String habitat) {
        super(name, habitat, false, "Asexual", "Autotrophic or Heterotrophic");
    }

    @Override
    public void grow() {
        System.out.println(name + " is growing by cell division.");
    }

    @Override
    public void reproduce() {
        System.out.println(name + " reproduces asexually in the " + habitat + " via binary fission or budding.");
    }

    @Override
    public void respire() {
        System.out.println(name + " is respiring through cellular respiration.");
    }

    @Override
    public void respondToStimuli() {
        System.out.println(name + " responds to environmental changes such as pH and temperature.");
    }

    @Override
    public void obtainNutrition() {
        System.out.println(name + " obtains nutrition by absorbing nutrients from its environment.");
    }

    // Class-specific behaviors for Microbial organisms:

    protected void formBiofilm() {
        System.out.println(name + " is forming a biofilm to protect itself and survive in " + habitat + ".");
    }

    protected void formSpores() {
        System.out.println(name + " is forming spores to survive harsh environmental conditions.");
    }

    protected void mutate() {
        System.out.println(name + " is undergoing genetic mutation for adaptation.");
    }

    protected void developAntibioticResistance() {
        System.out.println(name + " is developing resistance to antibiotics.");
    }

    protected void engageInSymbiosis() {
        System.out.println(name + " is engaging in a symbiotic relationship with other organisms.");
    }
}
