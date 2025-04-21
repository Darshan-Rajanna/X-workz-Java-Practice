package com.xworkz.ecosystem.interfaces;

public interface Territorial {
    default void defendTerritory(){
        System.out.println("default Territory");
    };

    void markBoundaries();

    void competeForResources();
}
