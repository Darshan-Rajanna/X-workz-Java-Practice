package com.xworkz.ecosystem.animals;

import com.xworkz.ecosystem.organisms.Animal;

public class Insect extends Animal {
    public Insect(String name, String habitat) {
        super(name, habitat);
    }

    public void crawlOrFly() {
        System.out.println(name + " can either crawl or fly depending on the species.");
    }

    public void exoskeleton() {
        System.out.println(name + " has a hard outer exoskeleton for protection.");
    }

    public void layEggs() {
        System.out.println(name + " lays eggs for reproduction.");
    }

    public void metamorphosis() {
        System.out.println(name + " undergoes metamorphosis during its lifecycle.");
    }

    public void hasAntennae() {
        System.out.println(name + " uses antennae to sense its surroundings.");
    }
}
