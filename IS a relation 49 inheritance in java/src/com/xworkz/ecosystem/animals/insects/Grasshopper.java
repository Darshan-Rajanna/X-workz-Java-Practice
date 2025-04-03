package com.xworkz.ecosystem.animals.insects;

import com.xworkz.ecosystem.animals.Insect;

public class Grasshopper extends Insect {
    public Grasshopper() {
        super("Grasshopper", "Fields and grasslands");
    }

    public void jumpHigh() {
        System.out.println(name + " has strong hind legs that enable it to jump long distances.");
    }
}
