package com.xworkz.ecosystem.animals.amphibians;

import com.xworkz.ecosystem.animals.Amphibian;

public class TreeFrog extends Amphibian {

    public TreeFrog() {
        super("Tree Frog", "Tropical forests and trees");
    }

    @Override
    public void liveInWaterAndLand() {
        System.out.println(name + " lives in trees but returns to water to breed.");
    }

    @Override
    public void layEggsInWater() {
        System.out.println(name + " lays eggs on leaves above water; tadpoles drop into the water after hatching.");
    }

    @Override
    public void undergoMetamorphosis() {
        System.out.println(name + " undergoes complete metamorphosis from egg to tadpole to adult frog.");
    }

    @Override
    public void moistSkin() {
        System.out.println(name + " has moist, permeable skin used for respiration and water absorption.");
    }

    @Override
    public void coldBlooded() {
        System.out.println(name + " adjusts its body temperature based on the environment.");
    }
}
