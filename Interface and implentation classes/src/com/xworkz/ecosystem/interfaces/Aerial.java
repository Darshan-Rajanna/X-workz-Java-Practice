package com.xworkz.ecosystem.interfaces;

public interface Aerial {
    default void spendMostTimeFlying(){
        System.out.println("Default Aerial");
    };
    void haveFlightAdaptations();
    void contributeToAerialEcosystem();

    default void Aerialinfo(){
        System.out.println("Arial info interface");
    }

    void predatorInfo();
}
