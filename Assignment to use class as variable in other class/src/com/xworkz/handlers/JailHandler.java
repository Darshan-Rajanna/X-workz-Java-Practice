package com.xworkz.handlers;

import com.xworkz.entities.Jail;

public class JailHandler {
    private Jail[] jails;
    private int count;

    public JailHandler(int size) {
        jails = new Jail[size];
        count = 0;
    }

    public void addJail(Jail jail) {
        if (count < jails.length) {
            jails[count] = jail;
            count++;
        }
    }

    public void displayJails() {
        for (int i = 0; i < count; i++) {
            System.out.println(jails[i].displayJail());
        }
    }
}
