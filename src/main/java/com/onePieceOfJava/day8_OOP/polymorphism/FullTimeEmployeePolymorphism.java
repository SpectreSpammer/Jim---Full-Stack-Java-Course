package com.onePieceOfJava.day8_OOP.polymorphism;

public class FullTimeEmployeePolymorphism implements EmployeeInterfacePolymorphism{

    private String name;
    private int id;
    private double baseSalary;
    private double bonus;

    public FullTimeEmployeePolymorphism(String name, int id, double baseSalary, double bonus) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public String getName() {

        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}
