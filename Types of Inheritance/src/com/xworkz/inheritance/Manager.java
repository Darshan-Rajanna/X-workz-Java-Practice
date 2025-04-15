package com.xworkz.inheritance;

public class Manager extends Employee {
    public void manage() {
        System.out.println("Manager: Managing team... (Inherited 'work' from Employee and 'walk' from Person)");
    }
}
