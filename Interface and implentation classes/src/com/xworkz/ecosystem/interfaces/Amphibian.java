package com.xworkz.ecosystem.interfaces;

public interface Amphibian {
    default void liveInWaterAndLand(){
        System.out.println("Default Amphibian");
    };
    void undergoMetamorphosis();
    default void breatheThroughSkin(){
        System.out.println("Ambhian");
    };

    // Default method overrides (if you add them in interfaces)
    void mammalInfo();

}
