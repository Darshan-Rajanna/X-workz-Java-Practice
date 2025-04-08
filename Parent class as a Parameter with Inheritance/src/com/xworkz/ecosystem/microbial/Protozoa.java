package com.xworkz.ecosystem.microbial;

import com.xworkz.ecosystem.organisms.Microbial;

public class Protozoa extends Microbial {

    public Protozoa(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void formBiofilm() {
        System.out.println(name + " can form part of biofilms in aquatic ecosystems.");
    }

    @Override
    public void formSpores() {
        System.out.println(name + " forms cysts or spores during harsh environmental conditions.");
    }

    @Override
    public void mutate() {
        System.out.println(name + " mutates to adapt and survive inside host organisms.");
    }

    @Override
    public void developAntibioticResistance() {
        System.out.println(name + " may develop resistance to anti-protozoal drugs.");
    }

    @Override
    public void engageInSymbiosis() {
        System.out.println(name + " lives symbiotically or parasitically within other organisms.");
    }
}
