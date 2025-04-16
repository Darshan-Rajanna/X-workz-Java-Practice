package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.Fish;

public class Salmonid implements Fish {
    public void swim() { System.out.println("Salmonid swims upstream to spawn"); }
    public void layEggs() { System.out.println("Salmonid lays eggs in freshwater streams"); }
}
