package com.xworkz.ecosystem.animals.amphibians;

import com.xworkz.ecosystem.animals.Amphibian;

public class TreeFrog extends Amphibian {
    public TreeFrog() {
        super("Tree Frog", "Rainforests, trees");
    }

    public void climbTrees() {
        System.out.println(name + " climbs trees using its sticky feet.");
    }
}
