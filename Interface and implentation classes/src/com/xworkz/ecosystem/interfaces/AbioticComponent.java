package com.xworkz.ecosystem.interfaces;

public interface AbioticComponent {
    void beNonLiving();
    void influenceBioticFactors();
    void providePhysicalEnvironment();

    default void AbioticComponentInfo(){
        System.out.println("Abiotic component iinfo");
    }
}