package com.onePieceOfJava.day8_OOP.inheritance;

public class MainInheritance {
    public static void main(String[] args) {

        EmployeeInheritance baseEmployee = new EmployeeInheritance(101,"Jim",50000.75);
        EmployeeInheritance fte = new FullTimeEmployeeInheritance(102,"Nan",60000.75, 30000.75);
        EmployeeInheritance pt = new PartTimeEmployeeInheritance(103,"Nami",70000.75, 2500,3);
        System.out.println("Base Employee:");
        baseEmployee.displayEmployeeInfo();
        System.out.println();
        System.out.println("Full Time Employee:");
        fte.displayEmployeeInfo();
        System.out.println();
        System.out.println("Part Time Employee:");
        pt.displayEmployeeInfo();
    }
}
