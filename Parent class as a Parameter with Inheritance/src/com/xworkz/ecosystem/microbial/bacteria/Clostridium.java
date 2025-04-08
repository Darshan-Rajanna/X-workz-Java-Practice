package com.xworkz.ecosystem.microbial.bacteria;

import com.xworkz.ecosystem.microbial.Bacteria;
import com.xworkz.ecosystem.organisms.Organism;

public class Clostridium extends Bacteria {

    public Clostridium(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void formBiofilm() {
        System.out.println(name + " (Clostridium) forms anaerobic biofilms in soil and intestines.");
    }

    @Override
    public void formSpores() {
        System.out.println(name + " (Clostridium) forms highly resistant endospores.");
    }

    @Override
    public void mutate() {
        System.out.println(name + " (Clostridium) mutates under antibiotic stress.");
    }

    @Override
    public void developAntibioticResistance() {
        System.out.println(name + " (Clostridium) develops resistance and causes hospital infections.");
    }

    @Override
    public void engageInSymbiosis() {
        System.out.println(name + " (Clostridium) can exist in gut but may cause disease when imbalanced.");
    }

    public void organismInfo(Organism organism) {
        if (organism == null) {
            System.out.println("Organism is null.");
            return;
        }

        if (organism instanceof Clostridium) {
            System.out.println("This organism is an instance of Clostridium.");
            ((Clostridium) organism).formSpores();
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
