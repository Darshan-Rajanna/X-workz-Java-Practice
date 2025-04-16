package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.FloweringPlant;

public class Tulip implements FloweringPlant {
    public void produceFlowers() { System.out.println("Tulip produces cup-shaped flowers"); }
    public void produceFruits() { System.out.println("Tulip produces capsule fruits"); }
    public void attractPollinators() { System.out.println("Tulip attracts bees with bright colors"); }
}
