package com.xworkz.ecosystem.microbial.bacteria;

import com.xworkz.ecosystem.microbial.Bacteria;
import com.xworkz.ecosystem.organisms.Organism;

public class Staphylococcus extends Bacteria {

    public Staphylococcus(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void formBiofilm() {
        System.out.println(name + " (Staphylococcus) forms a biofilm on medical implants or skin.");
    }

    @Override
    public void formSpores() {
        System.out.println(name + " (Staphylococcus) does not form spores but shows persistence.");
    }

    @Override
    public void mutate() {
        System.out.println(name + " (Staphylococcus) mutates under immune system pressure.");
    }

    @Override
    public void developAntibioticResistance() {
        System.out.println(name + " (Staphylococcus) can become MRSA - Methicillin-resistant.");
    }

    @Override
    public void engageInSymbiosis() {
        System.out.println(name + " (Staphylococcus) is a normal flora of the skin but can become pathogenic.");
    }

    public void organismInfo(Organism organism) {
        if (organism == null) {
            System.out.println("Organism is null.");
            return;
        }

        if (organism instanceof Staphylococcus) {
            System.out.println("This organism is an instance of Staphylococcus.");
            ((Staphylococcus) organism).formBiofilm();
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
