package com.xworkz.ecosystem.plants.flowers;

import com.xworkz.ecosystem.plants.FloweringPlant;

public class Rose extends FloweringPlant {
    public Rose(String name, String habitat) {
        super(name, habitat);
    }

    public void haveThorns() {
        System.out.println(name + " has thorns on its stem for protection.");
    }
}
