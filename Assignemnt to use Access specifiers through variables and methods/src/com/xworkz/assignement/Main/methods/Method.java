
package com.xworkz.assignement.Main.methods;
import com.xworkz.assignement.Main.variables.Variables;
import com.xworkz.assignement.Main.Main;

public class Method extends Main {
    public void publicMethod(){
        System.out.println("This is a Public method");
        System.out.println("I can access all methods from same class");
        privateMethod();
        defaultMethod();
        protectedMethod();

        System.out.println("I can access the public variables of other classes and packages and private methods of same package but not from other packages");
        Variables variables=new Variables();
        System.out.println("I can access an public variable : "+variables.intNumber);
        System.out.println("I cannot access an private variable of other package by instance");
        System.out.println("I cannot access an protected variable of other package or class in this but i can use an variable of protected from my super package and my sub package can use my example : "+stringvar);
    }
    private void privateMethod(){
        System.out.println("This is a Private method");
    }
    void defaultMethod(){
        System.out.println("This is a default method");
    }
    protected void protectedMethod(){
        System.out.println("This is an protected method");
    }
}
