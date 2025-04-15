package com.xworkz.college;

public abstract class AbstractLibrary {
    String libraryName;
    int totalBooks;
    int sections;
    boolean digitalAccess;

    public AbstractLibrary(String libraryName, int totalBooks, int sections, boolean digitalAccess) {
        this.libraryName = libraryName;
        this.totalBooks = totalBooks;
        this.sections = sections;
        this.digitalAccess = digitalAccess;
        System.out.println("Library initialized with all fields.");
    }

    public AbstractLibrary(String libraryName, int totalBooks, int sections) {
        this(libraryName, totalBooks, sections, false);
    }

    public AbstractLibrary(String libraryName, int totalBooks) {
        this(libraryName, totalBooks, 0, false);
    }
}
