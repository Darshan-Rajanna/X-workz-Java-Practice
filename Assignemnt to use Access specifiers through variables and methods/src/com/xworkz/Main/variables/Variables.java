package com.xworkz.Main.variables;

public class Variables {

    public int intNumber = 12;
    private char character = 'A';
    String string="default";
    protected boolean isprotected=true;
    public void varDemo(){
        System.out.println("I am an Variable class public method, I can access all the variables of this class irrespective of the access specifiers : ");
        System.out.println("public variable : "+intNumber);
        System.out.println("private variable : "+ character);
        System.out.println("protected variable : "+isprotected);
        System.out.println("default variable : " + isprotected);
    }

}
