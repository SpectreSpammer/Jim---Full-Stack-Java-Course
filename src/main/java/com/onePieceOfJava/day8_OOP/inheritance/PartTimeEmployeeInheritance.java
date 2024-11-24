package com.onePieceOfJava.day8_OOP.inheritance;

public class PartTimeEmployeeInheritance extends EmployeeInheritance {
    private double overtimepay;
    private int hoursWorked;

    public PartTimeEmployeeInheritance(
            int id, String name, double salary,double overtimepay,int hoursWorked) {
        super(id, name, salary);
        this.overtimepay = overtimepay;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (overtimepay * hoursWorked);
    }

    @Override
    public void displayEmployeeInfo(){
        super.displayEmployeeInfo();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Overtime Pay: " + overtimepay);
    }
}
