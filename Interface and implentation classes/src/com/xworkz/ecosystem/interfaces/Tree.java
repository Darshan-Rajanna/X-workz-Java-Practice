package com.xworkz.ecosystem.interfaces;

public interface Tree {
    default void growTall(){
        System.out.println("Default Tree");
    };
    void produceOxygen();
    void provideShade();
}
