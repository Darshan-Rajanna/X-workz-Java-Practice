package com.xworkz.ecosystem.animals.mammals;

import com.xworkz.ecosystem.animals.Mammal;

public class Kangaroo extends Mammal {
    public Kangaroo(String name, String habitat) {
        super(name, habitat);
    }

    public void hop() {
        System.out.println(name + " moves by hopping on strong hind legs.");
    }
}
