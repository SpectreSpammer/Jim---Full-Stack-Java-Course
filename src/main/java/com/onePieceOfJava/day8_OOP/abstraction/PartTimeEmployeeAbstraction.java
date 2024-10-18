package com.onePieceOfJava.day8_OOP.abstraction;

public class PartTimeEmployeeAbstraction extends EmployeeAbstraction{

    private int hoursWorked;
    private double overTimePay;

    public PartTimeEmployeeAbstraction(String name, int id, double baseSalary, int hoursWorked, double overTimePay) {
        super(name, id, baseSalary);
        this.hoursWorked = hoursWorked;
        this.overTimePay = overTimePay;
    }

    @Override
    double calculateSalary() {
        return baseSalary + ( hoursWorked * overTimePay);
    }
}
