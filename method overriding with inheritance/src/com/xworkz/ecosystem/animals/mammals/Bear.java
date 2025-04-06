package com.xworkz.ecosystem.animals.mammals;

import com.xworkz.ecosystem.animals.Mammal;

public class Bear extends Mammal {
    public Bear() {
        super("Bear", "Forests and mountains");
    }

    public void hibernate() {
        System.out.println(name + " hibernates during winter to conserve energy.");
    }

    public void eatOmnivorousDiet() {
        System.out.println(name + " eats both plants and animals.");
    }
}
