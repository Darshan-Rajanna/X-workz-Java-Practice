package com.xworkz.ecosystem.interfaces;

public interface Terrestrial {
    default void liveOnLand(){
        System.out.println("default Terrestrial");
    };

    void haveLandAdaptations();

    void contributeToTerrestrialEcosystem();
}
