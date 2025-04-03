package com.xworkz.ecosystem.animals.mammals;
import com.xworkz.ecosystem.animals.Mammal;

public class Elephant extends Mammal {
    public Elephant(String name, String habitat) {
        super(name, habitat);
    }

    public void useTrunk() {
        System.out.println(name + " uses its trunk for various activities like drinking water.");
    }
}
