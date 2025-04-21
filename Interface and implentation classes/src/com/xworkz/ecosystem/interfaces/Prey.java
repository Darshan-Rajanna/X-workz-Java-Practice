package com.xworkz.ecosystem.interfaces;

public interface Prey {
    default void evadePredators(){
        System.out.println("Default Prey");
    };

    void haveDefenseMechanisms();

    void reproduceQuickly();

    void preyInfo();
}
