package com.xworkz.ecosystem.animals.fish;

import com.xworkz.ecosystem.animals.Fish;

public class ElectricEel extends Fish {

    public ElectricEel() {
        super("Electric Eel", "Freshwater rivers and swamps");
    }

    @Override
    public void swim() {
        System.out.println(name + " swims slowly using its long, slender body.");
    }

    @Override
    public void breatheThroughGills() {
        System.out.println(name + " breathes through gills but also surfaces for air.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays eggs in nests built with saliva.");
    }

    @Override
    public void liveInWater() {
        System.out.println(name + " lives in murky freshwater environments.");
    }

    @Override
    public void hasFins() {
        System.out.println(name + " uses its fin-covered body to glide through water.");
    }
}
