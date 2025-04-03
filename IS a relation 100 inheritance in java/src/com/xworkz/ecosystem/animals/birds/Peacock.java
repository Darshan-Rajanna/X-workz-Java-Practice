package com.xworkz.ecosystem.animals.birds;

import com.xworkz.ecosystem.animals.Bird;

public class Peacock extends Bird {
    public Peacock() {
        super("Peacock", "Forests and grasslands");
    }

    public void courtshipDisplay() {
        System.out.println(name + " spreads its vibrant feathers in a courtship dance.");
    }

    public void loudCall() {
        System.out.println(name + " produces loud calls to communicate.");
    }
}
