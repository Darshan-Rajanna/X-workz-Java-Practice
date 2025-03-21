package com.xworkz.governament;

import com.xworkz.administration.House;
import com.xworkz.geography.State;

public class Minister {
    private String name;
    private Portfolio[] portfolios;
    private House house;
    private Security security;
    private State[] states;

    public Minister(String name) {
        this.name = name;
        this.portfolios = new Portfolio[]{new Portfolio("Chief Minister")};
        this.house = new House();
        this.security = new Security();
        this.states = new State[]{new State("Karnataka")};
    }

    public void display() {
        System.out.println("  Minister: " + name);
        for (Portfolio portfolio : portfolios) {
            portfolio.display();
        }
        house.display();
        security.display();
        for (State state : states) {
            state.display();
        }
    }
}
