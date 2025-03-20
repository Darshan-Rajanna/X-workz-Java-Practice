package com.xworkz.entities;

public class Cricket{
    Ticket ticket;
    public Cricket(Ticket ticket){
        if(ticket!=null) {
            this.ticket = ticket;
            System.out.println("This is the Cricket class constructor with Ticket as an Parameter");
        }
        else System.err.println("ticket is null the Cricket constructor has some error output");
    }
    public void watch(){
        ticket.buy();
        System.out.println("watching the Cricket with buying ticket from Ticket class"+ticket.cost);
    }
    public void profit(){
        ticket.sell();
        System.out.println("ticket is sold by the Ticket and had a Profit also"+ticket.cost);
    }
}