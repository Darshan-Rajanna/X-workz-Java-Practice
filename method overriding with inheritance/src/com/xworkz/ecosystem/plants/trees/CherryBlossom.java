package com.xworkz.ecosystem.plants.trees;

import com.xworkz.ecosystem.plants.Tree;

public class CherryBlossom extends Tree {
    public CherryBlossom() {
        super("Cherry Blossom", "Japan, Korea, temperate regions");
    }

    public void bloomSeasonally() {
        System.out.println(name + " blooms with beautiful pink and white flowers in spring.");
    }

    public void symbolizeRenewal() {
        System.out.println(name + " is a symbol of renewal and the fleeting nature of life.");
    }
}
