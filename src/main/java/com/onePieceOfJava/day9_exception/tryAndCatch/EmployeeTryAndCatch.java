package com.onePieceOfJava.day9_exception.tryAndCatch;

public class EmployeeTryAndCatch {
    private String name;
    private double salary;

    public EmployeeTryAndCatch(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double percentage){
        if(percentage < 0 || percentage > 100){
            throw new IllegalArgumentException("Invalid raise percentage. Must be between 0-100");
        }
        this.salary += this.salary * (percentage/100);
    }


}
