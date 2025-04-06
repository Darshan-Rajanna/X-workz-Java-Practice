package com.xworkz.ecosystem.plants.trees;

import com.xworkz.ecosystem.plants.Tree;

public class BaobabTree extends Tree {
    public BaobabTree() {
        super("Baobab Tree", "African savannas");
    }

    public void storeWater() {
        System.out.println(name + " stores water in its thick trunk to survive droughts.");
    }

    public void liveForThousandsOfYears() {
        System.out.println(name + " can live for thousands of years.");
    }
}
