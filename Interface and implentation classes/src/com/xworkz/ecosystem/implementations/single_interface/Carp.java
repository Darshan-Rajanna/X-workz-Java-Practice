package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.Fish;

public class Carp implements Fish {
    public void swim() { System.out.println("Carp swims in freshwater lakes and rivers"); }

    @Override
    public void breatheUnderwater() {

    }

    @Override
    public void layEggsInWater() {

    }

}
