package com.xworkz.ecosystem.plants;

import com.xworkz.ecosystem.organisms.Plant;

public class Fern extends Plant {
    public Fern(String name, String habitat) {
        super(name, habitat);
    }

    public void reproduceBySpores() {
        System.out.println(name + " reproduces through spores instead of seeds.");
    }

    public void thriveInShade() {
        System.out.println(name + " grows well in shaded, moist environments.");
    }

    public void haveFronds() {
        System.out.println(name + " has delicate fronds instead of typical leaves.");
    }

    public void absorbMoisture() {
        System.out.println(name + " absorbs moisture directly from the air and soil.");
    }

    public void preventSoilErosion() {
        System.out.println(name + " helps prevent soil erosion with its root system.");
    }
}
