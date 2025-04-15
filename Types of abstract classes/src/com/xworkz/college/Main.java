package com.xworkz.college;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Starting College Simulation ===\n");

        Department dept = new Department();
        dept.displayInfo();
        dept.displayDepartment();
        System.out.println();

        EngineeringStudent student = new EngineeringStudent();
        student.attendLecture();
        System.out.println();

        Professor prof = new Professor();
        prof.markAttendance();
        prof.teachSubject();
        System.out.println();

        LectureHall hall = new LectureHall("LH203", 60, true);
        hall.useClassroom();
        System.out.println();

        CentralLibrary lib = new CentralLibrary("Digital Central", 10000, 8, true);
        lib.showLibraryInfo();

        System.out.println("\n=== College Simulation Ended ===");
    }
}
