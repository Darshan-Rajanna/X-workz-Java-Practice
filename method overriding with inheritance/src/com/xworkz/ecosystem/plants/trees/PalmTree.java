package com.xworkz.ecosystem.plants.trees;

import com.xworkz.ecosystem.plants.Tree;

public class PalmTree extends Tree {
    public PalmTree() {
        super("Palm Tree", "Tropical and subtropical regions");
    }

    @Override
    public void growTall() {
        System.out.println(name + " grows tall with a crown of large leaves at the top.");
    }

    @Override
    public void shedLeaves() {
        System.out.println(name + " sheds old fronds to make way for new growth.");
    }

    @Override
    public void provideOxygen() {
        System.out.println(name + " helps purify air in tropical climates.");
    }

    @Override
    public void produceFruitsOrSeeds() {
        System.out.println(name + " produces coconuts, dates, or other fruits depending on species.");
    }

    @Override
    public void supportEcosystem() {
        System.out.println(name + " provides food, shelter, and shade in warm climates.");
    }
}
