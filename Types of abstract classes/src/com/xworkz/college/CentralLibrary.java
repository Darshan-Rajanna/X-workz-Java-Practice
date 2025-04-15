package com.xworkz.college;

public class CentralLibrary extends AbstractLibrary {
    public CentralLibrary(String name, int books, int sections, boolean digital) {
        super(name, books, sections, digital);
    }

    public void showLibraryInfo() {
        System.out.println("Welcome to Central Library: " + libraryName);
    }
}
