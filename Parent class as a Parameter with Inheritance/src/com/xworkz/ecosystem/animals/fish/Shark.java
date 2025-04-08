package com.xworkz.ecosystem.animals.fish;

import com.xworkz.ecosystem.animals.Fish;

public class Shark extends Fish {

    public Shark() {
        super("Shark", "All major oceans");
    }

    @Override
    public void swim() {
        System.out.println(name + " swims powerfully with its strong tail.");
    }

    @Override
    public void breatheThroughGills() {
        System.out.println(name + " breathes through multiple gill slits on each side.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays egg cases known as mermaid’s purses or gives live birth.");
    }

    @Override
    public void liveInWater() {
        System.out.println(name + " lives exclusively in saltwater environments.");
    }

    @Override
    public void hasFins() {
        System.out.println(name + " has sharp dorsal and pectoral fins for balance and movement.");
    }
}
