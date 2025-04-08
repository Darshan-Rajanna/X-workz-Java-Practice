package com.xworkz.ecosystem.animals.birds;

import com.xworkz.ecosystem.animals.Bird;

public class Macaw extends Bird {

    public Macaw() {
        super("Macaw", "Rainforests of Central and South America");
    }

    @Override
    public void fly() {
        System.out.println(name + " flies gracefully with strong, fast wing beats.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays eggs in tree cavities.");
    }

    @Override
    public void buildNest() {
        System.out.println(name + " nests in hollow tree trunks.");
    }

    @Override
    public void sing() {
        System.out.println(name + " mimics sounds and can talk like humans.");
    }

    @Override
    public void migrate() {
        System.out.println(name + " usually does not migrate but moves locally for food.");
    }
}
