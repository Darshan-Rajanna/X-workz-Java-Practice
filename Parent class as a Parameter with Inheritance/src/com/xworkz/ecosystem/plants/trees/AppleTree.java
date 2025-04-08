package com.xworkz.ecosystem.plants.trees;

import com.xworkz.ecosystem.plants.Tree;

public class AppleTree extends Tree {
    public AppleTree() {
        super("Apple Tree", "Temperate regions, orchards");
    }

    @Override
    public void growTall() {
        System.out.println(name + " grows to a moderate height suitable for fruit harvesting.");
    }

    @Override
    public void shedLeaves() {
        System.out.println(name + " is deciduous and sheds its leaves in autumn.");
    }

    @Override
    public void provideOxygen() {
        System.out.println(name + " contributes to oxygen production through photosynthesis.");
    }

    @Override
    public void produceFruitsOrSeeds() {
        System.out.println(name + " bears sweet apples containing seeds for reproduction.");
    }

    @Override
    public void supportEcosystem() {
        System.out.println(name + " supports birds, insects, and animals by providing food and shelter.");
    }
}
