package com.onePieceOfJava.day5_control_flow.loopStatement;

public class MainDoWhile {
    public static void main(String[] args) {

        /*
            Do -> while
         */

        System.out.println("Training modules completed");
        int trainingModule = 3;
        do{
            trainingModule++;
        }while (trainingModule < 5);

        System.out.println("All required trainings module has been completed");
    }
}
