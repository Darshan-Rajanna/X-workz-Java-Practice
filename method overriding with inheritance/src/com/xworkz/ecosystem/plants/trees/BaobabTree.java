package com.xworkz.ecosystem.plants.trees;

import com.xworkz.ecosystem.plants.Tree;

public class BaobabTree extends Tree {
    public BaobabTree() {
        super("Baobab Tree", "Savannas and dry regions");
    }

    @Override
    public void growTall() {
        System.out.println(name + " grows tall with a thick, water-storing trunk.");
    }

    @Override
    public void shedLeaves() {
        System.out.println(name + " sheds its leaves during the dry season.");
    }

    @Override
    public void provideOxygen() {
        System.out.println(name + " contributes to oxygen production in arid ecosystems.");
    }

    @Override
    public void produceFruitsOrSeeds() {
        System.out.println(name + " produces large fruits known as monkey bread.");
    }

    @Override
    public void supportEcosystem() {
        System.out.println(name + " supports wildlife and stores water in its trunk.");
    }
}
