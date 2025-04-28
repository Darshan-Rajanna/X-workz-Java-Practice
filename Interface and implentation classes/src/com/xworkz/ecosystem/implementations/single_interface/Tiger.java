package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.Mammal;

public class Tiger implements Mammal {
    public void giveBirth() { System.out.println("Tiger gives birth to 2-4 cubs"); }
    public void produceMilk() { System.out.println("Tigress nurses cubs for 6 months"); }
    public void regulateBodyTemperature() { System.out.println("Tiger maintains body heat in forests"); }

    @Override
    public void aerialInfo() {

    }
}
