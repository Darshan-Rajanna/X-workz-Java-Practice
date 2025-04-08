package com.xworkz.ecosystem.microbial.bacteria;
import com.xworkz.ecosystem.microbial.Bacteria;
import com.xworkz.ecosystem.organisms.Organism;

class Spirillum extends Bacteria {
    public Spirillum(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void formBiofilm() {
        System.out.println(name + " (Spirillum) forms spiral-shaped biofilms in " + habitat + ".");
    }

    @Override
    public void formSpores() {
        System.out.println(name + " (Spirillum) doesn't typically form spores.");
    }

    @Override
    public void mutate() {
        System.out.println(name + " (Spirillum) mutates due to UV radiation.");
    }

    @Override
    public void developAntibioticResistance() {
        System.out.println(name + " (Spirillum) gains resistance through gene mutation.");
    }

    @Override
    public void engageInSymbiosis() {
        System.out.println(name + " (Spirillum) lives in aquatic environments symbiotically.");
    }

    public void organismInfo(Organism organism) {
        if (organism instanceof Spirillum) {
            System.out.println("This organism is an instance of Spirillum.");
            ((Spirillum) organism).formBiofilm();
        } else if (organism instanceof Bacteria) {
            System.out.println("This organism is a Bacteria.");
            ((Bacteria) organism).developAntibioticResistance();
        } else {
            organism.grow();
            organism.obtainNutrition();
        }
    }
}