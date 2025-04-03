package com.xworkz.ecosystem.plants.trees;

import com.xworkz.ecosystem.plants.Tree;

public class AppleTree extends Tree {
    public AppleTree() {
        super("Apple Tree", "Temperate regions, orchards");
    }

    public void bearFruits() {
        System.out.println(name + " produces delicious apples.");
    }

    public void shedLeaves() {
        System.out.println(name + " is a deciduous tree and sheds its leaves in autumn.");
    }
}
