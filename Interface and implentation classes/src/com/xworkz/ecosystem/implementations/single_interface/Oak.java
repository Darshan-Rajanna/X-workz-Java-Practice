package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.Tree;

public class Oak implements Tree {
    public void growTall() { System.out.println("Oak grows up to 100 feet tall"); }
    public void produceOxygen() { System.out.println("Oak produces oxygen through photosynthesis"); }
    public void provideShade() { System.out.println("Oak provides dense canopy shade"); }
}
