package com.xworkz.ecosystem.plants.trees;
import com.xworkz.ecosystem.plants.Tree;

public class CoconutTree extends Tree {
    public CoconutTree(String name, String habitat) {
        super(name, habitat);
    }

    public void provideCoconuts() {
        System.out.println(name + " produces coconuts, which are used for food and oil.");
    }
}

