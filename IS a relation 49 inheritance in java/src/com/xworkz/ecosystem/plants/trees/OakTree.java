package com.xworkz.ecosystem.plants.trees;

import com.xworkz.ecosystem.plants.Tree;

public class OakTree extends Tree {
    public OakTree(String name, String habitat) {
        super(name, habitat);
    }

    public void produceAcorns() {
        System.out.println(name + " produces acorns, which are food for wildlife.");
    }
}
