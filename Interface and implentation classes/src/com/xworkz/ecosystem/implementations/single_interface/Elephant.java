package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.Mammal;

public class Elephant implements Mammal {
    public void giveBirth() { System.out.println("Elephant has 22 month gestation"); }
    public void produceMilk() { System.out.println("Elephant nurses calves for years"); }
    public void regulateBodyTemperature() { System.out.println("Elephant uses ears to cool down"); }

    @Override
    public void aerialInfo() {

    }
}
