package com.xworkz.governament;

public class Security {
    private Personnel[] personnel;

    public Security() {
        this.personnel = new Personnel[]{new Personnel("KA CM")};
    }

    public void display() {
        System.out.println("Security Details:");
//        for (Personnel person : personnel) {
//            person.display();
//        }
    }
}
