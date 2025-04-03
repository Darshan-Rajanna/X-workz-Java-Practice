package com.xworkz.ecosystem.plants.trees;

import com.xworkz.ecosystem.plants.Tree;

public class MapleTree extends Tree {
    public MapleTree() {
        super("Maple Tree", "Temperate forests");
    }

    public void produceMapleSyrup() {
        System.out.println(name + " produces maple syrup from its sap.");
    }

    public void showAutumnColors() {
        System.out.println(name + " displays beautiful red, orange, and yellow leaves in autumn.");
    }
}
