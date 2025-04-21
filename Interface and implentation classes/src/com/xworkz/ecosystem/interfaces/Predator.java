package com.xworkz.ecosystem.interfaces;

public interface Predator {
    default void hunt(){
        System.out.println("Default Predator");
    };

    void haveSharpSenses();

    void beAtTopOfFoodChain();

    void amphibianInfo();
}
