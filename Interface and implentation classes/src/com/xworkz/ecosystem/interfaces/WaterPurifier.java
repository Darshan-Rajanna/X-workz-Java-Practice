package com.xworkz.ecosystem.interfaces;

public interface WaterPurifier {
    default void filterImpurities(){
        System.out.println("default WaterPurifier");
    };

    void maintainWaterQuality();

    void supportAquaticLife();
}
