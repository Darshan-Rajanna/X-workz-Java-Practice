package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.Plant;

public class CherryTree implements Plant {
    public void photosynthesize() { System.out.println("Cherry tree uses sunlight to make food"); }
    public void grow() { System.out.println("Cherry tree grows and produces sweet fruit"); }
}
