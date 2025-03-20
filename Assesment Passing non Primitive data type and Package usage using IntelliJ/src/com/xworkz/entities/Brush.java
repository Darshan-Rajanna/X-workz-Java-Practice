package com.xworkz.entities;

import com.xworkz.enums.Color;

public class Brush {
    Color color;
    public Brush(Color color){
        if(color!=null){
            this.color=color;
            System.out.println("This is an Brush Constructor with Color enum as Parameter");
        }
        else System.err.println("color is empty Brush Constructor has the error");
    }
    public void clean(){
        System.out.println("Brush is cleaning teeth with color : "+color);
    }
    public void scrub(){
        System.out.println("Brush can Scrub your teeth and this brush color is : "+color);
    }
}