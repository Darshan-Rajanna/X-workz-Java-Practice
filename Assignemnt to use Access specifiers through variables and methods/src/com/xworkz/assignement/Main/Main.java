//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

package com.xworkz.assignement.Main;
import com.xworkz.assignement.Main.methods.Method;
import com.xworkz.assignement.Main.variables.Variables;

public class Main {
    protected String stringvar="protected string from Main method";

    public static void main(String[] args) {

        System.out.println("Access specifiers demo of Variable and the methods");
        Method method1=new Method();
        method1.publicMethod();
        Variables variables=new Variables();
        variables.varDemo();


    }
}