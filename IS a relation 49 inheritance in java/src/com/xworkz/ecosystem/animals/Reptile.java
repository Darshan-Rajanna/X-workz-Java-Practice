package com.xworkz.ecosystem.animals;

import com.xworkz.ecosystem.organisms.Animal;

public class Reptile extends Animal {
    public Reptile(String name, String habitat) {
        super(name, habitat);
    }

    public void crawl() {
        System.out.println(name + " is crawling on the ground.");
    }

    public void layEggs() {
        System.out.println(name + " lays eggs for reproduction.");
    }

    public void coldBlooded() {
        System.out.println(name + " is cold-blooded and depends on the environment for body heat.");
    }

    public void shedSkin() {
        System.out.println(name + " sheds its skin periodically.");
    }

    public void useCamouflage() {
        System.out.println(name + " uses camouflage to blend into its surroundings.");
    }
}
