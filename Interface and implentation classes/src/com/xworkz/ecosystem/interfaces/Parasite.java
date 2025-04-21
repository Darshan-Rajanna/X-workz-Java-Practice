package com.xworkz.ecosystem.interfaces;

public interface Parasite {
    default void dependOnHost(){
        System.out.println("Default Parasite");
    };

    void harmHost();

    void reproduceRapidly();
}
