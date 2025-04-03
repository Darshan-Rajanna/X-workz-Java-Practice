package com.xworkz.ecosystem.plants.trees;

import com.xworkz.ecosystem.plants.Tree;

public class PalmTree extends Tree {
    public PalmTree() {
        super("Palm Tree", "Tropical and subtropical regions");
    }

    public void produceCoconuts() {
        System.out.println(name + " produces coconuts and dates.");
    }

    public void withstandStrongWinds() {
        System.out.println(name + " has a flexible trunk that bends with strong winds.");
    }
}
