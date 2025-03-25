package com.xworkz.handlers;

import com.xworkz.entities.IdCard;

public class IdCardHandler {

    private IdCard[] idCards;
    private int count;

    // Constructor to initialize the ID Card array
    public IdCardHandler(int size) {
        idCards = new IdCard[size];
        count = 0;
    }

    // Method to add a new ID card
    public void addIdCard(IdCard idCard) {
        if (count < idCards.length) {
            idCards[count] = idCard;
            count++;
        } else {
            System.out.println("ID Card array is full. Cannot add more ID Cards.");
        }
    }

    // Method to display all ID cards
    public void displayIdCards() {
        if (count == 0) {
            System.out.println("No ID Cards available.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(idCards[i].displayIdCard());
        }
    }

    // Method to get an ID card by index
    public IdCard getIdCard(int index) {
        if (index >= 0 && index < count) {
            return idCards[index];
        } else {
            System.out.println("Invalid index. Returning null.");
            return null;
        }
    }
}
