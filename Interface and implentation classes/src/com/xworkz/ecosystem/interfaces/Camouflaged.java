package com.xworkz.ecosystem.interfaces;

public interface Camouflaged {
    default void blendWithEnvironment(){
        System.out.println("Default Camouflaged");
    };

    void avoidDetection();

    void enhanceSurvival();
}
