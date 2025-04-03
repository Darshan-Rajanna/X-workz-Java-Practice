package com.xworkz.ecosystem.fungi;

import com.xworkz.ecosystem.organisms.Fungi;

public class BreadMold extends Fungi {
    public BreadMold() {
        super("Bread Mold", "Stale bread, moist surfaces");
    }

    public void decomposeBread() {
        System.out.println(name + " decomposes bread and spreads spores.");
    }
}
