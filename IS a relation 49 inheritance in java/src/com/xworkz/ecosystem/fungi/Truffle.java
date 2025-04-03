package com.xworkz.ecosystem.fungi;

import com.xworkz.ecosystem.organisms.Fungi;

public class Truffle extends Fungi {
    public Truffle(String name, String habitat) {
        super(name, habitat);
    }

    public void fermentSugar() {
        System.out.println(name + " is fermenting sugar into alcohol or gas.");
    }
}
