package com.onePieceOfJava.day5_control_flow.loopStatement;

public class MainForLoop {
    public static void main(String[] args) {

        double salary = 50000.75;
        double annualRaisePercentage = 1.05;
        int yearsOfService = 6;

        //forcasting the salary for the 5 yrs
        //declaration/initialize; comparison  ; increment
        for( int year = 1; year<=5; year++){
            salary *= (1 + annualRaisePercentage);

            yearsOfService++;

            System.out.printf("Year %d - Salary Php %.2f, Years of Service %d %n",
                                year, salary, yearsOfService);
        }
    }
}
