package com.xworkz.ecosystem.animals.insects;

import com.xworkz.ecosystem.animals.Insect;

public class Butterfly extends Insect {
    public Butterfly() {
        super("Butterfly", "Gardens and forests");
    }

    public void pollinateFlowers() {
        System.out.println(name + " helps in pollination by transferring pollen from flower to flower.");
    }
}
