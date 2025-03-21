package com.xworkz.country;

import com.xworkz.governament.Minister;
public class PrimeMinister {

    private Minister[] minister;
    String name="Narendra Modi";
    public PrimeMinister(){
        minister=new Minister[]{new Minister("Siddaramiah")};

    }

    public void display(){
        System.out.println("Prime Minister of India is : " +name);
        for(Minister minister1: minister){
            minister1.display();
        }
    }
}