package com.onePieceOfJava.day8_OOP.polymorphism;

public class ContractualEmployeePolymorphism implements EmployeeInterfacePolymorphism{

    /*
        public = global variable it can accessed within other package
        private = can be accessed with its class = can be accessed with other package
        protected = can be accessed with its class = with its package only
        default = without any access modifer
    */
    private String name;
    private int id;
    private double baseSalary;
    private double overTimePay;
    private double workingHours;


    public ContractualEmployeePolymorphism(String name, int id, double baseSalary, double overTimePay, double workingHours) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
        this.overTimePay = overTimePay;
        this.workingHours = workingHours;
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
        return baseSalary + ( overTimePay * workingHours);
    }
}
