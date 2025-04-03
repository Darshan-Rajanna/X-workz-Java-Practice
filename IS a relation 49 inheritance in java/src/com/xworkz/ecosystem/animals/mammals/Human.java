package com.xworkz.ecosystem.animals.mammals;

import com.xworkz.ecosystem.animals.Mammal;

public class Human extends Mammal {
    public Human(String name, String habitat) {
        super(name, habitat);
    }

    public void speakLanguage() {
        System.out.println(name + " can communicate using complex languages.");
    }
}

