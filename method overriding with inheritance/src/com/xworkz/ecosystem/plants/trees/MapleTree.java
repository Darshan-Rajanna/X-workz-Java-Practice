package com.xworkz.ecosystem.plants.trees;

import com.xworkz.ecosystem.plants.Tree;

public class MapleTree extends Tree {
    public MapleTree() {
        super("Maple Tree", "Temperate forests and parks");
    }

    @Override
    public void growTall() {
        System.out.println(name + " grows tall and displays vibrant foliage.");
    }

    @Override
    public void shedLeaves() {
        System.out.println(name + " is deciduous and sheds colorful leaves in autumn.");
    }

    @Override
    public void provideOxygen() {
        System.out.println(name + " provides oxygen and shade in urban landscapes.");
    }

    @Override
    public void produceFruitsOrSeeds() {
        System.out.println(name + " produces winged seeds called samaras.");
    }

    @Override
    public void supportEcosystem() {
        System.out.println(name + " supports various birds, insects, and mammals.");
    }
}
