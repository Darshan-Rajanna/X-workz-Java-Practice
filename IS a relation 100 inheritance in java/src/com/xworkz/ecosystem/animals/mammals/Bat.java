package com.xworkz.ecosystem.animals.mammals;
import com.xworkz.ecosystem.animals.Mammal;
public class Bat extends Mammal {
    public Bat(String name, String habitat) {
        super(name, habitat);
    }

    public void fly() {
        System.out.println(name + " is the only mammal capable of true flight.");
    }
}

