package com.xworkz.ecosystem.animals.insects;

import com.xworkz.ecosystem.animals.Insect;

public class Ladybug extends Insect {
    public Ladybug() {
        super("Ladybug", "Gardens and crops");
    }

    public void eatAphids() {
        System.out.println(name + " feeds on aphids, making it a beneficial insect for agriculture.");
    }
}
