package com.xworkz.ecosystem.animals.mammals;
import com.xworkz.ecosystem.animals.Mammal;

public class Lion extends Mammal {
    public Lion(String name, String habitat) {
        super(name, habitat);
    }

    public void roar() {
        System.out.println(name + " roars to mark its territory.");
    }
}

