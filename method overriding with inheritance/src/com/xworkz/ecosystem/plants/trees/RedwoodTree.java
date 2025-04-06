package com.xworkz.ecosystem.plants.trees;

import com.xworkz.ecosystem.plants.Tree;

public class RedwoodTree extends Tree {
    public RedwoodTree() {
        super("Redwood Tree", "Coastal California");
    }

    public void growTallest() {
        System.out.println(name + " is the tallest tree species in the world.");
    }

    public void liveForCenturies() {
        System.out.println(name + " can live for thousands of years.");
    }
}
