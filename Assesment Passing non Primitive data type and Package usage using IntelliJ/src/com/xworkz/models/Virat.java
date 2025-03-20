package com.xworkz.models;

import com.xworkz.entities.*;

public class Virat {
    Brush brush;
    Clip clip;
    Cricket cricket;
    Ticket ticket;
    public Virat(Brush brush, Clip clip, Cricket cricket,Ticket ticket){
        if(brush!=null){
            this.brush=brush;
            System.out.println("Brush is in Virat");
        }
        else System.err.println("Brush is null so Virat has null pointer error");
        if(clip!=null){
            this.clip=clip;
            System.out.println("Clip is in Virat");
        }
        else System.err.println("Clip is null so Virat has null pointer error");
        if(cricket!=null){
            this.cricket=cricket;
            System.out.println("Cricket is in Virat");
        }
        else System.err.println("Cricket is null so Virat has null pointer error");
        if(ticket!=null){
            this.ticket=ticket;
            System.out.println("Ticket is in Virat");
        }
        else System.err.println("Ticket is null so Virat has null pointer error");

        System.out.println("This is the Virat Constructor");
    }
    public void play(){
        System.out.println("Virat is Playing.... ");
        cricket.watch();
        cricket.profit();
    }
    public void clean(){
        System.out.println("Virat is Cleaning.....");
        brush.clean();
        brush.scrub();
    }
    public void relax(){
        System.out.println("Virat is Relaxing....");
        ticket.sell();
        ticket.buy();
    }
    public void gift(){
        System.out.println("Virat gifting Anushka Clips....");
        clip.hold();
    }
}

