package com.xworkz.ecosystem.plants.trees;

import com.xworkz.ecosystem.plants.Tree;

public class BanyanTree extends Tree {
    public BanyanTree(String name, String habitat) {
        super(name, habitat);
    }

    public void growAerialRoots() {
        System.out.println(name + " grows aerial roots that develop into additional trunks.");
    }
}
