package com.xworkz.ecosystem.microbial;

import com.xworkz.ecosystem.organisms.Microbial;

public class Microalgae extends Microbial {

    public Microalgae(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void formBiofilm() {
        System.out.println(name + " forms biofilms on submerged surfaces in aquatic habitats.");
    }

    @Override
    public void formSpores() {
        System.out.println(name + " forms spores to survive periods of nutrient depletion.");
    }

    @Override
    public void mutate() {
        System.out.println(name + " undergoes mutation due to environmental stress like UV or pollutants.");
    }

    @Override
    public void developAntibioticResistance() {
        System.out.println(name + " shows resistance to algicides used in water treatment.");
    }

    @Override
    public void engageInSymbiosis() {
        System.out.println(name + " often forms mutualistic relationships with fungi to create lichens.");
    }
}
