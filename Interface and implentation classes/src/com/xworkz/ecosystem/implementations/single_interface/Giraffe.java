package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.Mammal;

public class Giraffe implements Mammal {
    public void giveBirth() { System.out.println("Giraffe gives birth to calves"); }
    public void produceMilk() { System.out.println("Giraffe nurses her calves"); }
    public void regulateBodyTemperature() { System.out.println("Giraffe maintains body heat through its large body size"); }
}
