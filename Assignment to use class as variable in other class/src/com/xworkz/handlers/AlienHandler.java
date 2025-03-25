package com.xworkz.handlers;

import com.xworkz.entities.Alien;

public class AlienHandler {
    private Alien[] aliens;
    private int index;

    public AlienHandler(int size) {
        this.aliens = new Alien[size];
        this.index = 0;
    }

    public void addAlien(Alien alien) {
        if (index < aliens.length) {
            aliens[index] = alien;
            index++;
        } else {
            System.out.println("Cannot add more aliens. Storage is full.");
        }
    }

    public void displayAllAliens() {
        System.out.println("Displaying all recorded aliens:");
        for (int i = 0; i < index; i++) {
            System.out.println(aliens[i].displayAlien());
        }
    }

    public Alien getAlienByIndex(int i) {
        if (i >= 0 && i < index) {
            return aliens[i];
        } else {
            System.out.println("Invalid index. No alien found.");
            return null;
        }
    }
}
