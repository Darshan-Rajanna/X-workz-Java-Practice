package com.xworkz.ecosystem.interfaces;

public interface Aquatic {
    void liveInWater();

    void haveAquaticAdaptations();

    default void contributeToAquaticEcosystem(){
        System.out.println("Aquatic default");
    };
}
