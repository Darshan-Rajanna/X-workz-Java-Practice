package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.Plant;

public class Cedar implements Plant {
    public void photosynthesize() { System.out.println("Cedar tree uses sunlight to make food"); }

    @Override
    public void convertSunlightToEnergy() {

    }

    @Override
    public void produceOxygen() {

    }
}
