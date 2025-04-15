package com.xworkz.inheritance;

public class HybridClass implements InterfaceA, InterfaceB {
    public void methodA() {
        System.out.println("HybridClass: Implementing methodA from InterfaceA.");
    }
    public void methodB() {
        System.out.println("HybridClass: Implementing methodB from InterfaceB.");
    }
    public void commonMethod() {
        System.out.println("HybridClass: Contains additional methods and supports Hybrid Inheritance via interfaces.");
    }
}
