package com.onePieceOfJava.day8_OOP.abstraction;

public class MainAbstraction {
    public static void main(String[] args) {

        EmployeeAbstraction fullTime = new FullTimeEmployeeAbstraction("Jim",101, 50000.75, 25000.75);
        EmployeeAbstraction partTime = new PartTimeEmployeeAbstraction("Jim",101, 50000.75, 3,1500.75);

        fullTime.displayInfo();
        System.out.println();
        partTime.displayInfo();
    }
}
