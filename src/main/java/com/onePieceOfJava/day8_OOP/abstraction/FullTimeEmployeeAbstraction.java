package com.onePieceOfJava.day8_OOP.abstraction;

public class FullTimeEmployeeAbstraction extends EmployeeAbstraction{

    private double bonus;

    public FullTimeEmployeeAbstraction(String name, int id, double baseSalary,double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {

        return baseSalary + bonus;
    }
}
