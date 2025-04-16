package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.Plant;

public class Daisy implements Plant {
    public void photosynthesize() { System.out.println("Daisy uses sunlight to make food"); }
    public void grow() { System.out.println("Daisy grows as a short, flowering plant"); }
}
