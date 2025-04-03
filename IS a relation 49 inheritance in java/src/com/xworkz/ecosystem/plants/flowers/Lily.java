package com.xworkz.ecosystem.plants.flowers;

import com.xworkz.ecosystem.plants.FloweringPlant;

public class Lily extends FloweringPlant {
    public Lily(String name, String habitat) {
        super(name, habitat);
    }

    public void emitFragrance() {
        System.out.println(name + " has a pleasant fragrance.");
    }
}
