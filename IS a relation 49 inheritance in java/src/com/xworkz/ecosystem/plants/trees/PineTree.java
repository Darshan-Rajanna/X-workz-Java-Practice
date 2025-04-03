package com.xworkz.ecosystem.plants.trees;
import com.xworkz.ecosystem.plants.Tree;

public class PineTree extends Tree {
    public PineTree(String name, String habitat) {
        super(name, habitat);
    }

    public void produceCones() {
        System.out.println(name + " produces cones that contain seeds.");
    }
}
