package com.xworkz.ecosystem.plants;

import com.xworkz.ecosystem.organisms.Plant;

public class Tree extends Plant {
    public Tree(String name, String habitat) {
        super(name, habitat);
    }

    public void growTall() {
        System.out.println(name + " is growing tall and strong.");
    }

    public void shedLeaves() {
        System.out.println(name + " sheds leaves in certain seasons.");
    }

    public void provideOxygen() {
        System.out.println(name + " releases oxygen through photosynthesis.");
    }

    public void produceFruitsOrSeeds() {
        System.out.println(name + " produces fruits or seeds for reproduction.");
    }

    public void supportEcosystem() {
        System.out.println(name + " provides shelter and food to various organisms.");
    }
}
