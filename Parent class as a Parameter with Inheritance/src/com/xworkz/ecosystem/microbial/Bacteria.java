package com.xworkz.ecosystem.microbial;

import com.xworkz.ecosystem.organisms.Microbial;

public class Bacteria extends Microbial {

    public Bacteria(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void formBiofilm() {
        System.out.println(name + " (a bacterium) is forming a sticky biofilm on a surface in " + habitat + ".");
    }

    @Override
    public void formSpores() {
        System.out.println(name + " is forming endospores to survive extreme conditions in " + habitat + ".");
    }

    @Override
    public void mutate() {
        System.out.println(name + " is undergoing a genetic mutation due to UV exposure or chemical agents.");
    }

    @Override
    public void developAntibioticResistance() {
        System.out.println(name + " has developed resistance to antibiotics through horizontal gene transfer.");
    }

    @Override
    public void engageInSymbiosis() {
        System.out.println(name + " is living symbiotically in the gut of a host organism.");
    }
}
