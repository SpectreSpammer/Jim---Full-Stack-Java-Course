package com.onePieceOfJava.day8_OOP.encapsulation;

public class MainEncapsulation {
    public static void main(String[] args) {
        EmployeeEncapsulation employee = new EmployeeEncapsulation("Jim",101,50000.75);

        System.out.println("Employee Name: " +employee.getName());
        System.out.println("Employee Id: " +employee.getId());
        System.out.println("Employee Salary: " +employee.getSalary());

        employee.setName("Nan");
        employee.setSalary(75000.75);
        System.out.println();
        System.out.println(" --- Trying to get the else statement for salary --- ");
        employee.setSalary(0);

        employee.salaryIncreaseByPercentage(10);

        System.out.println();
        System.out.println(" --- After the update using Setter ---");
        System.out.println("Employee Name: " +employee.getName());
        System.out.println("Employee Salary: " +employee.getSalary());

    }
}
