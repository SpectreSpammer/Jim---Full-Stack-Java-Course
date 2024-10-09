package com.onePieceOfJava.day8_OOP.polymorphism;

public interface EmployeeInterfacePolymorphism {

    String getName();
    int getId();
    double getBaseSalary();
    double calculateSalary();


    default void displayInfo(){
        System.out.println("Employee Id: " + getId());
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee Salary: " + calculateSalary());
    }

}
