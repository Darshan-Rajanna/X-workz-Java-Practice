package com.xworkz.main;

import com.xworkz.encapsulationdemo.Employee;
import com.xworkz.encapsulationdemo.Company;

public class Main {
    public static void main(String[] args){
        // Encapsulation

        Employee emp = new Employee();
        emp.setName("Om");
        emp.setAge(42);
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());

        // Static variable and method example
        System.out.println("Company Name: " + Company.getCompanyName());
    }
}
