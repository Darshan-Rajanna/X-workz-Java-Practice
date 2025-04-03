package com.xworkz.ecosystem.plants.flowers;

import com.xworkz.ecosystem.plants.FloweringPlant;

public class Sunflower extends FloweringPlant {
    public Sunflower(String name, String habitat) {
        super(name, habitat);
    }

    public void followSun() {
        System.out.println(name + " moves its head towards the sun.");
    }
}
