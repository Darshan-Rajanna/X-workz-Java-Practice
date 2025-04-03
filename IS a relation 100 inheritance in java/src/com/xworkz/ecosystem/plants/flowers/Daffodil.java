package com.xworkz.ecosystem.plants.flowers;

import com.xworkz.ecosystem.plants.FloweringPlant;

public class Daffodil extends FloweringPlant {
    public Daffodil() {
        super("Daffodil", "Woodlands, gardens, temperate climates");
    }

    public void earlySpringBloom() {
        System.out.println(name + " blooms in early spring, signaling the end of winter.");
    }

    public void toxicIfEaten() {
        System.out.println(name + " is toxic if consumed by humans or animals.");
    }
}
