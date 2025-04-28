package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.Mammal;

public class Wolf implements Mammal {
    public void giveBirth() { System.out.println("Wolf gives birth to pups"); }
    public void produceMilk() { System.out.println("Wolf nurses her pups"); }
    public void regulateBodyTemperature() { System.out.println("Wolf maintains body heat through fur"); }

    @Override
    public void aerialInfo() {

    }
}
