package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.Tree;

public class Pine implements Tree {
    public void growTall() { System.out.println("Pine grows straight and tall"); }
    public void produceOxygen() { System.out.println("Pine produces oxygen year-round"); }
    public void provideShade() { System.out.println("Pine provides light shade"); }
}
