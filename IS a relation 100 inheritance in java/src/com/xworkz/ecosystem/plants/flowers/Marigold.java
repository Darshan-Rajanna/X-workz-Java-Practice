package com.xworkz.ecosystem.plants.flowers;

import com.xworkz.ecosystem.plants.FloweringPlant;

public class Marigold extends FloweringPlant {
    public Marigold() {
        super("Marigold", "Gardens, fields, farms");
    }

    public void pestRepellent() {
        System.out.println(name + " acts as a natural pest repellent in gardens.");
    }

    public void usedInFestivals() {
        System.out.println(name + " is widely used in decorations and religious festivals.");
    }
}
