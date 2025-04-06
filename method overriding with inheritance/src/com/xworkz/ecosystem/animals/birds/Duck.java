package com.xworkz.ecosystem.animals.birds;

import com.xworkz.ecosystem.animals.Bird;

public class Duck extends Bird {
    public Duck() {
        super("Duck", "Lakes, rivers, and wetlands");
    }

    public void swim() {
        System.out.println(name + " swims gracefully using its webbed feet.");
    }

    public void quack() {
        System.out.println(name + " makes quacking sounds.");
    }
}
