package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.FloweringPlant;

public class Rose implements FloweringPlant {
    public void produceFlowers() { System.out.println("Rose produces fragrant flowers"); }
    public void produceFruits() { System.out.println("Rose produces rose hips"); }
    public void attractPollinators() { System.out.println("Rose attracts bees and butterflies"); }
}
