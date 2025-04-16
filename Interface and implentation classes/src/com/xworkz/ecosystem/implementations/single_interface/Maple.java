package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.Tree;

public class Maple implements Tree {
    public void growTall() { System.out.println("Maple grows to medium height"); }
    public void produceOxygen() { System.out.println("Maple produces oxygen in summer"); }
    public void provideShade() { System.out.println("Maple provides excellent shade"); }
}
