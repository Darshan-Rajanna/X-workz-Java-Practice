package com.xworkz.ecosystem.implementations.dual_interface;

import com.xworkz.ecosystem.interfaces.Mammal;
import com.xworkz.ecosystem.interfaces.Terrestrial;

public class Darshan implements Mammal, Terrestrial {
    @Override
    public void giveBirth() {
        System.out.println("Darshan is capble of giving birth");
    }

    @Override
    public void produceMilk() {
        System.out.println("he cannot produce milk since gender is Male");
    }

    @Override
    public void regulateBodyTemperature() {
        System.out.println("can regulate body temperature");
    }

    @Override
    public void aerialInfo() {

    }

    @Override
    public void liveOnLand() {
        System.out.println("can live on land");
    }

    @Override
    public void haveLandAdaptations() {
        System.out.println("have land adaptations like limbs");
    }

    @Override
    public void contributeToTerrestrialEcosystem() {
        System.out.println("destroys the terristrial ecosystem");
    }
}
