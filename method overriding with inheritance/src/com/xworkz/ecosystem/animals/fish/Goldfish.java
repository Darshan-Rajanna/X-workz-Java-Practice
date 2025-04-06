package com.xworkz.ecosystem.animals.fish;

import com.xworkz.ecosystem.animals.Fish;

public class Goldfish extends Fish {

    public Goldfish() {
        super("Goldfish", "Freshwater ponds and aquariums");
    }

    @Override
    public void swim() {
        System.out.println(name + " swims gently and gracefully in still waters.");
    }

    @Override
    public void breatheThroughGills() {
        System.out.println(name + " breathes through gills efficiently in clean water.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays sticky eggs on aquatic plants.");
    }

    @Override
    public void liveInWater() {
        System.out.println(name + " lives peacefully in aquariums and calm waters.");
    }

    @Override
    public void hasFins() {
        System.out.println(name + " has ornamental fins used for slow swimming.");
    }
}
