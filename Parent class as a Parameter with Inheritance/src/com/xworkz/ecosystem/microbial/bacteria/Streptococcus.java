package com.xworkz.ecosystem.microbial.bacteria;
import com.xworkz.ecosystem.microbial.Bacteria;
import com.xworkz.ecosystem.organisms.Organism;

public class Streptococcus extends Bacteria {
    public Streptococcus(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void formBiofilm() {
        System.out.println(name + " (Streptococcus) forms chains of round cells in biofilms.");
    }

    @Override
    public void formSpores() {
        System.out.println(name + " (Streptococcus) does not typically form spores.");
    }

    @Override
    public void mutate() {
        System.out.println(name + " (Streptococcus) undergoes genetic shift to evade immunity.");
    }

    @Override
    public void developAntibioticResistance() {
        System.out.println(name + " (Streptococcus) resists antibiotics using efflux pumps.");
    }

    @Override
    public void engageInSymbiosis() {
        System.out.println(name + " (Streptococcus) may exist in oral or throat flora.");
    }

    public void organismInfo(Organism organism) {
        if (organism instanceof Streptococcus) {
            System.out.println("This organism is an instance of Streptococcus.");
            ((Streptococcus) organism).formBiofilm();
        } else if (organism instanceof Bacteria) {
            ((Bacteria) organism).developAntibioticResistance();
        } else {
            organism.grow();
            organism.obtainNutrition();
        }
    }
}

