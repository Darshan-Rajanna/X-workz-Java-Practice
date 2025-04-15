package com.xworkz.college;

public class LectureHall extends AbstractClassroom {
    public LectureHall(String roomNumber, int capacity, boolean projectorAvailable) {
        super(roomNumber, capacity, projectorAvailable);
    }

    public void useClassroom() {
        System.out.println("Lecture in progress in room: " + roomNumber);
    }
}
