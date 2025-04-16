package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.Mammal;

public class Hippopotamus implements Mammal {
    public void giveBirth() { System.out.println("Hippopotamus gives birth to calves in water"); }
    public void produceMilk() { System.out.println("Hippopotamus nurses her calves"); }
    public void regulateBodyTemperature() { System.out.println("Hippopotamus stays cool by staying in water"); }
}
