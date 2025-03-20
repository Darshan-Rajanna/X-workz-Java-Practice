package com.xworkz.entities;

public class Clip{
    String color;
    public Clip(String color){
        this.color=color;
        System.out.println("this is the Clip Constructor using Strig color as Parameter ");
    }
    public void hold(){
        System.out.println("This is hold method of Clip with color is : "+color);
    }
}