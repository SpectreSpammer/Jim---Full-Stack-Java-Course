package com.onePieceOfJava.day6_arrays.declaringAndInitializing;


import java.util.Arrays;

public class MainDeclaringAndInitializing {
    public static void main(String[] args) {
        //infinite storage arrays
        String [] employeeNames = {"Jim","Nan","Mugi","Luffy","nami"};
        double [] salary = {50000.75,60000.75,70000.75,80000.75};
        int[] hoursWorkedPerWeek = {35,40,45,50};

        //1,2,3,4,5 -> normal math
        //0,1,2,3,4 -> arrays
        //limits storage of arrays
        String [] department = new String[4];
        department[0] = "IT";
        department[1] = "hr";
        department[2] = "pr";
        department[3] = "marketing";

        double [] bonus = new double[4];
        bonus[0] = 10000.75;
        bonus[1] = 20000.75;
        bonus[2] = 30000.75;
        bonus[3] = 40000.75;

        //manual printing
        System.out.println("Manual Printing of Employees: " + Arrays.toString(employeeNames));
        System.out.println("Manual Printing of Salaries: " + Arrays.toString(salary));
        System.out.println("Manual Printing of Hours worked per week: " + Arrays.toString(hoursWorkedPerWeek));
        System.out.println("Manual Printing of departments: " + Arrays.toString(department));
        System.out.println("Manual Printing of bonus: " + Arrays.toString(bonus));
        System.out.println();
        //printing arrays using for each
        System.out.print("Printing of Employees using for each: " );
        for(String names : employeeNames){
            System.out.print(names + ", ");
        }
        System.out.println();
        System.out.print("Printing of Salary using for each: " );
        for(double salaries : salary){
            System.out.print(salaries + ", ");
        }

        System.out.println();
        System.out.print("Printing of Hours worked per week using for each: " );
        for(double hoursWorked : hoursWorkedPerWeek){
            System.out.print(hoursWorked + ", ");
        }

        System.out.print("Printing of departments: " );
        for(String dept : department){
            System.out.print(dept + ", ");
        }


    }
}
