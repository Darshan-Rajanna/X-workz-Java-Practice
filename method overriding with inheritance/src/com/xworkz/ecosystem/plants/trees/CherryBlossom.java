package com.xworkz.ecosystem.plants.trees;

import com.xworkz.ecosystem.plants.Tree;

public class CherryBlossom extends Tree {
    public CherryBlossom() {
        super("Cherry Blossom Tree", "Temperate regions and ornamental gardens");
    }

    @Override
    public void growTall() {
        System.out.println(name + " grows to a moderate height with beautiful spring blooms.");
    }

    @Override
    public void shedLeaves() {
        System.out.println(name + " sheds leaves in autumn after its spring bloom.");
    }

    @Override
    public void provideOxygen() {
        System.out.println(name + " contributes to fresh air in urban landscapes.");
    }

    @Override
    public void produceFruitsOrSeeds() {
        System.out.println(name + " may produce small cherries depending on the variety.");
    }

    @Override
    public void supportEcosystem() {
        System.out.println(name + " attracts pollinators and beautifies the environment.");
    }
}
