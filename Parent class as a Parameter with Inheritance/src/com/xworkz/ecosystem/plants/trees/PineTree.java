package com.xworkz.ecosystem.plants.trees;

import com.xworkz.ecosystem.plants.Tree;

public class PineTree extends Tree {
    public PineTree() {
        super("Pine Tree", "Mountainous and temperate regions");
    }

    @Override
    public void growTall() {
        System.out.println(name + " grows tall with needle-like leaves.");
    }

    @Override
    public void shedLeaves() {
        System.out.println(name + " gradually sheds old needles over time.");
    }

    @Override
    public void provideOxygen() {
        System.out.println(name + " contributes to fresh, pine-scented air.");
    }

    @Override
    public void produceFruitsOrSeeds() {
        System.out.println(name + " produces cones containing seeds.");
    }

    @Override
    public void supportEcosystem() {
        System.out.println(name + " provides nesting space for birds and insects.");
    }
}
