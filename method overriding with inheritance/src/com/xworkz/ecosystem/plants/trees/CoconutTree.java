package com.xworkz.ecosystem.plants.trees;

import com.xworkz.ecosystem.plants.Tree;

public class CoconutTree extends Tree {
    public CoconutTree() {
        super("Coconut Tree", "Coastal regions and tropical areas");
    }

    @Override
    public void growTall() {
        System.out.println(name + " grows tall with a slender trunk and feather-like leaves.");
    }

    @Override
    public void shedLeaves() {
        System.out.println(name + " sheds old fronds as it grows.");
    }

    @Override
    public void provideOxygen() {
        System.out.println(name + " improves coastal air quality by releasing oxygen.");
    }

    @Override
    public void produceFruitsOrSeeds() {
        System.out.println(name + " produces coconuts, which contain edible flesh and water.");
    }

    @Override
    public void supportEcosystem() {
        System.out.println(name + " provides habitat and food near beaches and shores.");
    }
}
