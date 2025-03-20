package com.xworkz.entities;

import com.xworkz.enums.TicketType;

public class Ticket {
    TicketType ticketType;
    double cost;
    public Ticket(TicketType ticketType, double cost){
        this.cost=cost;
        this.ticketType=ticketType;
        System.out.println("This is the Ticket Constructor using the parameter of TicketType enum and double cost");
    }
    public void buy(){
        System.out.println("Ticket is bought for the cost of : Rs. " +cost);
    }
    public void sell(){
        System.out.println("Ticket is sold with a proper income with "+ticketType+" tickets");
    }
}