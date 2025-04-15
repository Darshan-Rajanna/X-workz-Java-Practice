package com.xworkz.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        System.out.println("=== SINGLE-LEVEL INHERITANCE ===");
        Dog dog = new Dog();
        dog.breathe();
        dog.bark();
        System.out.println("In single-level inheritance, Dog inherits from Animal directly.\n");

        System.out.println("=== MULTI-LEVEL INHERITANCE ===");
        Manager manager = new Manager();
        manager.walk();
        manager.work();
        manager.manage();
        System.out.println("In multi-level inheritance, Manager -> Employee -> Person.\n");

        System.out.println("=== HIERARCHICAL INHERITANCE ===");
        Car car = new Car();
        car.fuel();
        car.drive();

        Bike bike = new Bike();
        bike.fuel();
        bike.ride();
        System.out.println("In hierarchical inheritance, Car and Bike both inherit from Vehicle.\n");

        System.out.println("=== HYBRID INHERITANCE (via Interfaces) ===");
        HybridClass hybrid = new HybridClass();
        hybrid.methodA();
        hybrid.methodB();
        hybrid.commonMethod();
        System.out.println("Hybrid inheritance achieved using multiple interfaces.\n");

        System.out.println("=== NOTE: MULTIPLE INHERITANCE ===");
        System.out.println("Java doesn't support multiple inheritance using classes due to ambiguity.");
        System.out.println("It allows multiple inheritance using interfaces instead.");
    }
}
