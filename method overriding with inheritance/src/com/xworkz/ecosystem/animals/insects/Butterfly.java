package com.xworkz.ecosystem.animals.insects;

import com.xworkz.ecosystem.animals.Insect;

public class Butterfly extends Insect {

    public Butterfly() {
        super("Butterfly", "Gardens, meadows, and forests");
    }

    @Override
    public void crawlOrFly() {
        System.out.println(name + " flies gracefully using its colorful wings.");
    }

    @Override
    public void exoskeleton() {
        System.out.println(name + " has a lightweight exoskeleton for protection and mobility.");
    }

    @Override
    public void metamorphosis() {
        System.out.println(name + " undergoes complete metamorphosis from egg to adult.");
    }

    @Override
    public void hasAntennae() {
        System.out.println(name + " uses long antennae to detect scents and navigate.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays eggs on the underside of leaves.");
    }
}
