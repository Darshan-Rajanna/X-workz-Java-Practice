package com.xworkz.ecosystem.plants.trees;
import com.xworkz.ecosystem.plants.Tree;

public class MangoTree extends Tree {
    public MangoTree(String name, String habitat) {
        super(name, habitat);
    }

    public void bearSweetFruits() {
        System.out.println(name + " produces delicious mango fruits.");
    }
}
