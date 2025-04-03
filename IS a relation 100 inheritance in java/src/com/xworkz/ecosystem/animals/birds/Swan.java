package com.xworkz.ecosystem.animals.birds;

import com.xworkz.ecosystem.animals.Bird;

public class Swan extends Bird {
    public Swan() {
        super("Swan", "Lakes and ponds");
    }

    public void gracefulMovement() {
        System.out.println(name + " moves gracefully on water.");
    }

    public void monogamousBehavior() {
        System.out.println(name + " forms lifelong bonds with a mate.");
    }
}
