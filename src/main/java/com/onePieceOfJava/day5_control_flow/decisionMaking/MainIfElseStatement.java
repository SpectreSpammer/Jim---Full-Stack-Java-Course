package com.onePieceOfJava.day5_control_flow.decisionMaking;

public class MainIfElseStatement {
    public static void main(String[] args) {
        // && || != ==

        double salary = 30000.75;
        int hoursWorked = 40;
        double bonus = 25000.75;
        int yearsOfService = 3;

        // && AND
        // False && true
        if( hoursWorked > 45 && salary < 60000.75 ) {
            System.out.println("1. Jim worked 45 hrs and his basic salary is less than Php 60,000");
        }else {
            System.out.println("1. Either Jim worked under time  or his basic salary is Php 60,000 or more");
        }

        // || OR
        //true || false
        if( yearsOfService > 5 || salary > 80000.75){
            System.out.println("2. Jim is either a long time employee or highly Paid");
        }else {
            System.out.println("2. Jim is neither a long time employee nor highly Paid");
        }

        // != NOT EQUAL
        if( bonus != yearsOfService){
            System.out.println("3. Jim bonus is not equal to his years of Service");
        }else {
            System.out.println("3. Jim bonus is equal to his years of Service");
        }
    }
}
