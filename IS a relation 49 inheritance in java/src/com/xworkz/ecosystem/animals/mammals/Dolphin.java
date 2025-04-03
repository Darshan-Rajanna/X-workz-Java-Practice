package com.xworkz.ecosystem.animals.mammals;

import com.xworkz.ecosystem.animals.Mammal;
public class Dolphin extends Mammal {
    public Dolphin(String name, String habitat) {
        super(name, habitat);
    }

    public void echolocate() {
        System.out.println(name + " uses echolocation to navigate and find prey.");
    }
}

