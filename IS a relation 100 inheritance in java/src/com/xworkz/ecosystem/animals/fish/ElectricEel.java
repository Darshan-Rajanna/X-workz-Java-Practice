package com.xworkz.ecosystem.animals.fish;

import com.xworkz.ecosystem.animals.Fish;

public class ElectricEel extends Fish {
    public ElectricEel() {
        super("Electric Eel", "Freshwater rivers in South America");
    }

    public void produceElectricShocks() {
        System.out.println(name + " produces electric shocks to hunt and defend itself.");
    }
}
