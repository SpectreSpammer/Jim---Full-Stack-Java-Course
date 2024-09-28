package com.onePieceOfJava.day3_variables_and_data_types.reference;

public class Manager implements Employee{
    @Override
    public void work() {
        System.out.println("Manager is overseeing the projects");
    }

    @Override
    public void takeBreak() {
        System.out.println("Manager is taking a short break");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Manager is leading a meeting");
    }
}
