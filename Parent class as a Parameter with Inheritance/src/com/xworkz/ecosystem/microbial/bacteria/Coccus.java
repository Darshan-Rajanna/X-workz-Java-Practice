package com.xworkz.ecosystem.microbial.bacteria;

import com.xworkz.ecosystem.microbial.Bacteria;
import com.xworkz.ecosystem.organisms.Organism;

public class Coccus extends Bacteria {

    public Coccus(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void formBiofilm() {
        System.out.println(name + " (Coccus) forms a spherical biofilm in " + habitat + ".");
    }

    @Override
    public void formSpores() {
        System.out.println(name + " (Coccus) rarely forms spores but can resist dehydration.");
    }

    @Override
    public void mutate() {
        System.out.println(name + " (Coccus) mutates to adapt antibiotic presence.");
    }

    @Override
    public void developAntibioticResistance() {
        System.out.println(name + " (Coccus) develops resistance via plasmid exchange.");
    }

    @Override
    public void engageInSymbiosis() {
        System.out.println(name + " (Coccus) may live symbiotically in the human mouth or gut.");
    }

    public void organismInfo(Organism organism) {
        if (organism == null) {
            System.out.println("Organism is null.");
            return;
        }

        if (organism instanceof Coccus) {
            System.out.println("This organism is an instance of Coccus.");
            ((Coccus) organism).formBiofilm();
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
