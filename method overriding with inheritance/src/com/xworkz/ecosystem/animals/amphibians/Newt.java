package com.xworkz.ecosystem.animals.amphibians;

import com.xworkz.ecosystem.animals.Amphibian;

public class Newt extends Amphibian {

    public Newt() {
        super("Newt", "Forests and wetlands");
    }

    @Override
    public void liveInWaterAndLand() {
        System.out.println(name + " spends its life both in water and on land during different stages.");
    }

    @Override
    public void layEggsInWater() {
        System.out.println(name + " lays eggs in calm freshwater, attaching them to aquatic plants.");
    }

    @Override
    public void undergoMetamorphosis() {
        System.out.println(name + " undergoes metamorphosis from aquatic larva to terrestrial juvenile (eft).");
    }

    @Override
    public void moistSkin() {
        System.out.println(name + " has smooth, moist skin which helps in gas exchange.");
    }

    @Override
    public void coldBlooded() {
        System.out.println(name + " is ectothermic and hibernates in cold climates.");
    }
}
