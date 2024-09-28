package com.onePieceOfJava.day3_variables_and_data_types.reference;

public class Designer implements Employee{
    @Override
    public void work() {
        System.out.println("Designer is creating user interface");
    }

    @Override
    public void takeBreak() {
        System.out.println("Designer is taking a walk");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Designer is presenting designs in a meeting");
    }
}
