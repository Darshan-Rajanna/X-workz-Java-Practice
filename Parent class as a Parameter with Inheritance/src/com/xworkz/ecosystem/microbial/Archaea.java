package com.xworkz.ecosystem.microbial;

import com.xworkz.ecosystem.organisms.Microbial;

public class Archaea extends Microbial {

    public Archaea(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void formBiofilm() {
        System.out.println(name + " (an archaeon) is forming a resilient biofilm in " + habitat + ".");
    }

    @Override
    public void formSpores() {
        System.out.println(name + " forms spores to withstand extreme environments like hot springs.");
    }

    @Override
    public void mutate() {
        System.out.println(name + " mutates to adapt to highly saline or acidic conditions.");
    }

    @Override
    public void developAntibioticResistance() {
        System.out.println(name + " naturally resists many antibiotics due to its unique cell wall structure.");
    }

    @Override
    public void engageInSymbiosis() {
        System.out.println(name + " is living symbiotically in the digestive system of animals.");
    }
}
