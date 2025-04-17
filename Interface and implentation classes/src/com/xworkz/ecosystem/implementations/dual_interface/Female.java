package com.xworkz.ecosystem.implementations.dual_interface;

import com.xworkz.ecosystem.interfaces.Mammal;
import com.xworkz.ecosystem.interfaces.Territorial;

public class Female implements Mammal, Territorial {

    @Override
    public void giveBirth() {
        System.out.println("Female can give birth");
    }

    @Override
    public void produceMilk() {
        System.out.println("Female can produce milk");
    }

    @Override
    public void regulateBodyTemperature() {
        System.out.println("Female can Regulate Body temperature");
    }

    @Override
    public void defendTerritory() {
        System.out.println("Female have their own territory where they rule over all so yeah they can defend Territory");
    }

    @Override
    public void markBoundaries() {
        System.out.println("yes Female mark boundaries and don't allow me to home when i am late to home or do mischiefs ex: my mom");
    }

    @Override
    public void competeForResources() {
        System.out.println("Female compete for resources because they love to : (No comments over here)");
    }
}
