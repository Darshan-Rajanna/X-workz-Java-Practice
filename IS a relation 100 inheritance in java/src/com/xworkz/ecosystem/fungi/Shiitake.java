package com.xworkz.ecosystem.fungi;

import com.xworkz.ecosystem.organisms.Fungi;

public class Shiitake extends Fungi {
    public Shiitake() {
        super("Shiitake", "Forests, decaying wood");
    }

    public void usedInAsianCuisine() {
        System.out.println(name + " is widely used in Asian cuisine for its rich flavor.");
    }
}
