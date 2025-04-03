package com.xworkz.ecosystem.animals.insects;

import com.xworkz.ecosystem.animals.Insect;

public class HoneyBee extends Insect {
    public HoneyBee() {
        super("HoneyBee", "Beehives and meadows");
    }

    public void collectNectar() {
        System.out.println(name + " collects nectar from flowers to produce honey.");
    }
}
