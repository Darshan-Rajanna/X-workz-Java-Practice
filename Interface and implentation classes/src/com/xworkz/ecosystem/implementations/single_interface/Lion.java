package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.Mammal;

public class Lion implements Mammal {
    public void giveBirth() { System.out.println("Lion gives birth to cubs"); }
    public void produceMilk() { System.out.println("Lioness nurses her cubs"); }
    public void regulateBodyTemperature() { System.out.println("Lion maintains body heat through fur"); }
}