package com.xworkz.country;

public class Country{
    private PrimeMinister primeMinister;
    String name="India";

    public Country(){
        this.primeMinister=new PrimeMinister();
        System.out.println("Country has an PrimeMinister");
    }

    public void display(){
        System.out.println("This is an Country "+name);
        primeMinister.display();
    }
}