package com.xworkz.ecosystem.microbial;

import com.xworkz.ecosystem.organisms.Microbial;

public class Viruses extends Microbial {

    public Viruses(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void formBiofilm() {
        System.out.println(name + " does not form biofilms, but can persist on surfaces in " + habitat + ".");
    }

    @Override
    public void formSpores() {
        System.out.println(name + " does not form spores but can remain dormant inside host cells.");
    }

    @Override
    public void mutate() {
        System.out.println(name + " mutates rapidly, allowing it to evade immune responses.");
    }

    @Override
    public void developAntibioticResistance() {
        System.out.println(name + " is unaffected by antibiotics but may develop resistance to antiviral drugs.");
    }

    @Override
    public void engageInSymbiosis() {
        System.out.println(name + " relies on host cells to replicate, often resulting in parasitic relationships.");
    }
}
