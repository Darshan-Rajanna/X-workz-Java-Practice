package com.xworkz.ecosystem.animals.birds;

import com.xworkz.ecosystem.animals.Bird;

public class Penguin extends Bird {
    public Penguin(String name, String habitat) {
        super(name, habitat);
    }

    public void swim() {
        System.out.println(name + " is an excellent swimmer and hunts underwater.");
    }
}

