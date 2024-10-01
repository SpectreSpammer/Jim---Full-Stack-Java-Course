package com.onePieceOfJava.day5_control_flow.loopStatement;

public class MainForEach {
    public static void main(String[] args) {
        String [] employeeNames = {"Nan","Jim","John","Maria"};
        double [] salary = {80000.75,60000.75,710000.75,50000.75};
        int[] yearsOfService = {6,8,10,12};

        //old way
        for(int i=0; i < employeeNames.length;i++){
            String name = employeeNames[i];
            double BaseSalary = salary [i];
            int years = yearsOfService[i];

            System.out.println("Employee Name: " + name);
            System.out.println("Salary : " + BaseSalary);
            System.out.println("Years of Service: " + years);
            System.out.println();
        }

        // for each
        System.out.println("List of Employees");
        for(String name : employeeNames){
            System.out.println(" - " + name);
        }

        int totalYears = 0;
        for(int years : yearsOfService){
            totalYears += years;
        }
        System.out.println("\n Total years of Service " + totalYears);


        double highestSalary = 0;
        for(double baseSalary : salary){
            if(baseSalary > highestSalary){
                highestSalary = baseSalary;
            }

        }
        System.out.printf("Highest base salary: Php %.2f %n", highestSalary);
    }
}
