package com.xworkz.college;

public abstract class AbstractClassroom {
    String roomNumber;
    int capacity;
    boolean projectorAvailable;

    public AbstractClassroom(String roomNumber, int capacity, boolean projectorAvailable) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.projectorAvailable = projectorAvailable;
        System.out.println("Classroom initialized with room: " + roomNumber + ", capacity: " + capacity + ", projector: " + projectorAvailable);
    }
}
