package com.xworkz.ecosystem.animals.birds;

import com.xworkz.ecosystem.animals.Bird;

public class BarnOwl extends Bird {
    public BarnOwl() {
        super("Barn Owl", "Woodlands and farmlands");
    }

    public void silentFlight() {
        System.out.println(name + " flies silently to hunt at night.");
    }

    public void nightHunting() {
        System.out.println(name + " hunts small rodents using its excellent hearing.");
    }
}
