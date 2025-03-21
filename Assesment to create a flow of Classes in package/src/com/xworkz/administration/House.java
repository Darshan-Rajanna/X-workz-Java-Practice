package com.xworkz.administration;

public class House {
    private Room[] rooms;
    private HouseKeep[] houseKeeps;

    public House() {
        this.rooms = new Room[]{new Room("Living Room")};
        this.houseKeeps = new HouseKeep[]{new HouseKeep("Transport Service")};
    }

    public void display() {
        System.out.println("    House Details:");
        for (Room room : rooms) {
            room.display();
        }
        for (HouseKeep houseKeep : houseKeeps) {
            houseKeep.display();
        }
    }
}
