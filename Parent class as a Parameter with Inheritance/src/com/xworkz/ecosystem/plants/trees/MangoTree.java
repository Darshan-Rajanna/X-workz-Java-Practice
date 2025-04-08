package com.xworkz.ecosystem.plants.trees;

import com.xworkz.ecosystem.plants.Tree;

public class MangoTree extends Tree {
    public MangoTree() {
        super("Mango Tree", "Tropical and subtropical regions");
    }

    @Override
    public void growTall() {
        System.out.println(name + " grows tall with a broad canopy.");
    }

    @Override
    public void shedLeaves() {
        System.out.println(name + " sheds leaves before the flowering season.");
    }

    @Override
    public void provideOxygen() {
        System.out.println(name + " purifies the air and releases oxygen.");
    }

    @Override
    public void produceFruitsOrSeeds() {
        System.out.println(name + " produces sweet, juicy mangoes.");
    }

    @Override
    public void supportEcosystem() {
        System.out.println(name + " provides shade, shelter, and food for many species.");
    }
}
