package com.onePieceOfJava.day8_OOP.polymorphism;

public class MainPolymorphism {
    public static void main(String[] args) {
        EmployeeInterfacePolymorphism fte = new FullTimeEmployeePolymorphism("Jim",101,50000.75,25000.75);
        fte.displayInfo();
        fte.calculateSalary();
        System.out.println();


        EmployeeInterfacePolymorphism contractual = new ContractualEmployeePolymorphism("Nan",201,60000.75,10000.75,3);
        contractual.displayInfo();
        contractual.calculateSalary();
        System.out.println();
    }
}
