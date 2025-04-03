package com.xworkz.ecosystem.fungi;

import com.xworkz.ecosystem.organisms.Fungi;

public class Mushroom extends Fungi {
    public Mushroom(String name, String habitat) {
        super(name, habitat);
    }

    public void produceEdibleFruitingBody() {
        System.out.println(name + " is producing an edible fruiting body.");
    }
}
