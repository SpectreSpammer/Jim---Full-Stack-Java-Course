package com.onePieceOfJava.day5_control_flow.jumpStatements;

public class MainBreakAndContinue {
    public static void main(String[] args) {

        double salary = 50000.75;
        int performanceRating = 4;

        for( int year = 1; year <=5; year++){
            if(year == 3){
                System.out.println("Skipping year 3");
//                break;
               continue;
            }
            salary *= 1.05;
            System.out.printf("Year %d: Php %.2f %n", year, salary);

        }
    }
}
