package com.onePieceOfJava.day8_OOP.abstraction;

public abstract class EmployeeAbstraction {

    protected String name;
    protected int id;
    protected double baseSalary;

    public EmployeeAbstraction(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();

    public void displayInfo(){
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + calculateSalary());
    }


}
