package com.xworkz.Main;

import com.xworkz.country.Country;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Start of the flow");
        System.out.println("----------------------------------");

        Country country=new Country();
        country.display();
    }
}