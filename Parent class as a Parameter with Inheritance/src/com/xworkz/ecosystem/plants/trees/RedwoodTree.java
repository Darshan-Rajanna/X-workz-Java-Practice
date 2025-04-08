package com.xworkz.ecosystem.plants.trees;

import com.xworkz.ecosystem.plants.Tree;

public class RedwoodTree extends Tree {
    public RedwoodTree() {
        super("Redwood Tree", "Foggy coastal regions");
    }

    @Override
    public void growTall() {
        System.out.println(name + " is among the tallest trees on Earth.");
    }

    @Override
    public void shedLeaves() {
        System.out.println(name + " sheds small branches and needles.");
    }

    @Override
    public void provideOxygen() {
        System.out.println(name + " contributes significantly to oxygen production.");
    }

    @Override
    public void produceFruitsOrSeeds() {
        System.out.println(name + " produces cones with tiny seeds.");
    }

    @Override
    public void supportEcosystem() {
        System.out.println(name + " offers habitat to birds, mammals, and lichens.");
    }
}
