package com.xworkz.ecosystem.animals.birds;

import com.xworkz.ecosystem.animals.Bird;

public class Flamingo extends Bird {
    public Flamingo(String name, String habitat) {
        super(name, habitat);
    }

    public void filterFeed() {
        System.out.println(name + " filters small organisms from water using its beak.");
    }
}

