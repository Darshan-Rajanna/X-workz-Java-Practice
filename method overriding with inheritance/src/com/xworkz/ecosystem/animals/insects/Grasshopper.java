package com.xworkz.ecosystem.animals.insects;

import com.xworkz.ecosystem.animals.Insect;

public class Grasshopper extends Insect {

    public Grasshopper() {
        super("Grasshopper", "Grasslands and fields");
    }

    @Override
    public void crawlOrFly() {
        System.out.println(name + " crawls and makes powerful jumps, and can also fly.");
    }

    @Override
    public void exoskeleton() {
        System.out.println(name + " has a tough exoskeleton to protect its body.");
    }

    @Override
    public void metamorphosis() {
        System.out.println(name + " undergoes incomplete metamorphosis.");
    }

    @Override
    public void hasAntennae() {
        System.out.println(name + " uses its long antennae to sense touch and smell.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays eggs in soil or plant stems.");
    }
}
