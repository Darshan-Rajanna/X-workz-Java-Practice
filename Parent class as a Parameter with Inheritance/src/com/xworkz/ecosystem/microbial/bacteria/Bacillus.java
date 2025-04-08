package com.xworkz.ecosystem.microbial.bacteria;

import com.xworkz.ecosystem.microbial.Bacteria;
import com.xworkz.ecosystem.organisms.Organism;

public class Bacillus extends Bacteria {
    public Bacillus(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void formBiofilm() {
        System.out.println(name + " (Bacillus) forms rod-shaped biofilm in " + habitat + ".");
    }

    @Override
    public void formSpores() {
        System.out.println(name + " (Bacillus) forms spores to survive harsh environments.");
    }

    @Override
    public void mutate() {
        System.out.println(name + " (Bacillus) mutates due to environmental stress.");
    }

    @Override
    public void developAntibioticResistance() {
        System.out.println(name + " (Bacillus) develops resistance via mutation and gene transfer.");
    }

    @Override
    public void engageInSymbiosis() {
        System.out.println(name + " (Bacillus) lives in symbiosis with plant roots.");
    }

    public void organismInfo(Organism organism) {
        if (organism == null) {
            System.out.println("Organism is null.");
            return;
        }

        if (organism instanceof Bacillus) {
            System.out.println("This organism is an instance of Bacillus.");
            ((Bacillus) organism).formBiofilm();
        } else if (organism instanceof Bacteria) {
            System.out.println("This organism is an instance of Bacteria.");
            ((Bacteria) organism).developAntibioticResistance();
        } else {
            System.out.println("This is a general Organism.");
            organism.grow();
            organism.obtainNutrition();
        }
    }
}
