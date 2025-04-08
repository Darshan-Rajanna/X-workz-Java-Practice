package com.xworkz.ecosystem.animals.insects;

import com.xworkz.ecosystem.animals.Insect;

public class HoneyBee extends Insect {

    public HoneyBee() {
        super("Honeybee", "Hives, gardens, and meadows");
    }

    @Override
    public void crawlOrFly() {
        System.out.println(name + " flies quickly while gathering nectar.");
    }

    @Override
    public void exoskeleton() {
        System.out.println(name + " has a rigid exoskeleton to protect its segmented body.");
    }

    @Override
    public void metamorphosis() {
        System.out.println(name + " undergoes complete metamorphosis inside the hive.");
    }

    @Override
    public void hasAntennae() {
        System.out.println(name + " uses antennae for detecting pheromones and communication.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " queen lays thousands of eggs inside the hive.");
    }
}
