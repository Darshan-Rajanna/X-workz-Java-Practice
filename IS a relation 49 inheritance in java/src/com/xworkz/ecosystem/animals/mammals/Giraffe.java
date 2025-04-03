package com.xworkz.ecosystem.animals.mammals;

import com.xworkz.ecosystem.animals.Mammal;

public class Giraffe extends Mammal {
    public Giraffe() {
        super("Giraffe", "African savannas");
    }

    public void longNeck() {
        System.out.println(name + " has a long neck to reach leaves from tall trees.");
    }

    public void runFast() {
        System.out.println(name + " can run fast to escape predators.");
    }
}
