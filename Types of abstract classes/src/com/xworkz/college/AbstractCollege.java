package com.xworkz.college;

public abstract class AbstractCollege {
    String name = "Xworkz Engineering College";
    String location = "Bangalore";

    public void displayInfo() {
        System.out.println("College Name: " + name);
        System.out.println("Location: " + location);
    }
}
