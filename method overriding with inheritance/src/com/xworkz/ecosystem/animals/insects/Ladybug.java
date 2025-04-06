package com.xworkz.ecosystem.animals.insects;

import com.xworkz.ecosystem.animals.Insect;

public class Ladybug extends Insect {

    public Ladybug() {
        super("Ladybug", "Gardens, forests, and fields");
    }

    @Override
    public void crawlOrFly() {
        System.out.println(name + " crawls on plants and can also fly using hidden wings.");
    }

    @Override
    public void exoskeleton() {
        System.out.println(name + " has a dome-shaped exoskeleton with bright colors.");
    }

    @Override
    public void metamorphosis() {
        System.out.println(name + " undergoes complete metamorphosis from larva to adult.");
    }

    @Override
    public void hasAntennae() {
        System.out.println(name + " uses short antennae for smell and touch.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays clusters of eggs on the underside of leaves.");
    }
}
