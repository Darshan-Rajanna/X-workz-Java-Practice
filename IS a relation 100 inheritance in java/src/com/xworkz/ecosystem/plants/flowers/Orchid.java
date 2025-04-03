package com.xworkz.ecosystem.plants.flowers;

import com.xworkz.ecosystem.plants.FloweringPlant;

public class Orchid extends FloweringPlant {
    public Orchid(String name, String habitat) {
        super(name, habitat);
    }

    public void growOnTrees() {
        System.out.println(name + " often grows on trees as an epiphyte.");
    }
}

