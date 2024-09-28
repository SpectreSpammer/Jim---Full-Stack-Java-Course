package com.onePieceOfJava.day4_operators_in_java.comparison;

public class MainComparison {
    public static void main(String[] args) {

        // == , !+, > , < , >=, <=
        double salary = 55000;
        double bonus = 20000;
        int yearsOfService = 10;
        int hoursWorked = 35;
        int hourlyRate = 501;

        //Equal to ==
        if(yearsOfService ==7){
            System.out.println("1. Jim has been with the company for exactly 7 years");

        }else {
            System.out.println("1. Jim years of service is not 7 years");
        }

        // Not Equal to !=
        if(salary != 55000){
            System.out.println("2. Jim base salary is not 55000");
        }else {
            System.out.println("2. Jim base salary is  55000");
        }

        // greater than >
        if( hoursWorked > 40){
            System.out.println("3. Jim worked for 40 hrs this week");
        }else {
            System.out.println("3. Jim is under time this week");
        }

        // less than <
        if( hourlyRate < 500){
            System.out.println("4. Jim hourly rate is less than Php 500");
        }else {
            System.out.println("4. Jim hourly rate is Php 500 or more");
        }

        // greater than or equal to >=
        double totalCompensation = salary + bonus;
        if( totalCompensation >= 75000.00){
            System.out.println("5. Jim total compensation is Php 75000 or more");
        }else {
            System.out.println("5. Jim total compensation is less than Php 75000");
        }


        //less than or equal to <=
        if(yearsOfService <= 10){
            System.out.println("6. Jim has been with the company for 10 years or less");
        }else {
            System.out.println("6. Jim has been with the company for more than 10 years");
        }




    }
}
