package com.xworkz.ecosystem.interfaces;

public interface LiveBearer {
    default void giveBirthToLiveYoung(){
        System.out.println("default LiveBearer");
    };

    void provideInternalNourishment();

    void haveLowerOffspringNumbers();
}
