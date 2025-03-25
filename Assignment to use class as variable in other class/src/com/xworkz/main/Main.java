package com.xworkz.main;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    String name= "Darshan";
    static int birthYear=2003;

    public void display(int birthYear){
        int year=2025;
        System.out.println("The local variable is : "+year);
        System.out.println("age of the person is : "+(year-birthYear));
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        System.out.println("The static variable is : "+birthYear);
        System.out.println("The local variable cannot be accesible from the outer class or block");
        Main main1=new Main();
        System.out.println("The instance variable here we are using 'this' keyword for referring the instance name"+main1.name);
        main1.ageOfThePerson();
    }

    public void ageOfThePerson(){
        System.out.println("The age of the person is : ");
        display(2003);
    }
}