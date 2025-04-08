package com.xworkz.ecosystem.microbial.bacteria;

import com.xworkz.ecosystem.microbial.Bacteria;
import com.xworkz.ecosystem.organisms.Organism;

public class Pseudomonas extends Bacteria {

    public Pseudomonas(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void formBiofilm() {
        System.out.println(name + " (Pseudomonas) forms thick biofilms in water and soil.");
    }

    @Override
    public void formSpores() {
        System.out.println(name + " (Pseudomonas) does not form spores but resists desiccation.");
    }

    @Override
    public void mutate() {
        System.out.println(name + " (Pseudomonas) mutates for environmental adaptation.");
    }

    @Override
    public void developAntibioticResistance() {
        System.out.println(name + " (Pseudomonas) is multidrug-resistant in hospitals.");
    }

    @Override
    public void engageInSymbiosis() {
        System.out.println(name + " (Pseudomonas) can help in plant growth promotion.");
    }

    public void organismInfo(Organism organism) {
        if (organism == null) {
            System.out.println("Organism is null.");
            return;
        }

        if (organism instanceof Pseudomonas) {
            System.out.println("This organism is an instance of Pseudomonas.");
            ((Pseudomonas) organism).formBiofilm();
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
