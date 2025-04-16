package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.Plant;

public class Orchid implements Plant {
    public void photosynthesize() { System.out.println("Orchid uses sunlight to make food"); }

    @Override
    public void convertSunlightToEnergy() {
        System.out.println("Orchid uses sunlight to make food n convert to energy");
    }

    @Override
    public void produceOxygen() {
        System.out.println("Orchid uses sunlight to make food n give O2");
    }

}
