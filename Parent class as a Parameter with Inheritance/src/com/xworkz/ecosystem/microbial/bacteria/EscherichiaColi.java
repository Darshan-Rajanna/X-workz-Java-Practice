package com.xworkz.ecosystem.microbial.bacteria;

import com.xworkz.ecosystem.microbial.Bacteria;
import com.xworkz.ecosystem.organisms.Organism;

public class EscherichiaColi extends Bacteria {

    public EscherichiaColi(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void formBiofilm() {
        System.out.println(name + " (E. coli) forms a protective biofilm in the intestine.");
    }

    @Override
    public void formSpores() {
        System.out.println(name + " (E. coli) does not form spores but adapts to harsh gut environments.");
    }

    @Override
    public void mutate() {
        System.out.println(name + " (E. coli) mutates quickly under antibiotic pressure.");
    }

    @Override
    public void developAntibioticResistance() {
        System.out.println(name + " (E. coli) has acquired resistance genes from plasmids.");
    }

    @Override
    public void engageInSymbiosis() {
        System.out.println(name + " (E. coli) lives symbiotically in the human gut.");
    }

    public void organismInfo(Organism organism) {
        if (organism == null) {
            System.out.println("Organism is null.");
            return;
        }

        if (organism instanceof EscherichiaColi) {
            System.out.println("This organism is an instance of EscherichiaColi.");
            ((EscherichiaColi) organism).formBiofilm();
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
