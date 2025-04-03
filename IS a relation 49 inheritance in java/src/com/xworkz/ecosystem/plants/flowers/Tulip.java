package com.xworkz.ecosystem.plants.flowers;

import com.xworkz.ecosystem.plants.FloweringPlant;

public class Tulip extends FloweringPlant {
    public Tulip(String name, String habitat) {
        super(name, habitat);
    }

    public void bloomInSpring() {
        System.out.println(name + " blooms beautifully in the spring season.");
    }
}

