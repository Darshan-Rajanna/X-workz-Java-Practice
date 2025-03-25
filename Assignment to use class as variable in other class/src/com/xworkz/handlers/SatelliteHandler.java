package com.xworkz.handlers;

import com.xworkz.entities.Satellite;

public class SatelliteHandler {

    private Satellite[] satellites;
    private int count;

    // Constructor to initialize the satellite array
    public SatelliteHandler(int size) {
        satellites = new Satellite[size];
        count = 0;
    }

    // Method to add a new satellite
    public void addSatellite(Satellite satellite) {
        if (count < satellites.length) {
            satellites[count] = satellite;
            count++;
        } else {
            System.out.println("Satellite array is full. Cannot add more satellites.");
        }
    }

    // Method to display all satellites
    public void displaySatellites() {
        if (count == 0) {
            System.out.println("No satellites available.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(satellites[i].displaySatellite());
        }
    }

    // Method to get a satellite by index
    public Satellite getSatellite(int index) {
        if (index >= 0 && index < count) {
            return satellites[index];
        } else {
            System.out.println("Invalid index. Returning null.");
            return null;
        }
    }
}
