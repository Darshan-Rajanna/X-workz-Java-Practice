package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.FloweringPlant;

public class Lily implements FloweringPlant {
    public void produceFlowers() { System.out.println("Lily produces trumpet-shaped flowers"); }
    public void produceFruits() { System.out.println("Lily produces capsule fruits"); }
    public void attractPollinators() { System.out.println("Lily attracts butterflies"); }
}
