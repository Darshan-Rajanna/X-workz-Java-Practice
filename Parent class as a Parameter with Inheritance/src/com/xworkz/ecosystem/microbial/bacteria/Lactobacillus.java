package com.xworkz.ecosystem.microbial.bacteria;

import com.xworkz.ecosystem.microbial.Bacteria;
import com.xworkz.ecosystem.organisms.Organism;

public class Lactobacillus extends Bacteria {

    public Lactobacillus(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void formBiofilm() {
        System.out.println(name + " (Lactobacillus) forms beneficial biofilms in the gut and vagina.");
    }

    @Override
    public void formSpores() {
        System.out.println(name + " (Lactobacillus) does not form spores.");
    }

    @Override
    public void mutate() {
        System.out.println(name + " (Lactobacillus) undergoes mutation to improve fermentation.");
    }

    @Override
    public void developAntibioticResistance() {
        System.out.println(name + " (Lactobacillus) has natural resistance to some antibiotics.");
    }

    @Override
    public void engageInSymbiosis() {
        System.out.println(name + " (Lactobacillus) lives symbiotically in digestive and reproductive tracts.");
    }

    public void organismInfo(Organism organism) {
        if (organism == null) {
            System.out.println("Organism is null.");
            return;
        }

        if (organism instanceof Lactobacillus) {
            System.out.println("This organism is an instance of Lactobacillus.");
            ((Lactobacillus) organism).formBiofilm();
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
