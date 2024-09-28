package com.onePieceOfJava.day3_variables_and_data_types.reference;

public class Developer implements Employee {

    @Override
    public void work() {
        System.out.println("Developer is writting a code");
    }

    @Override
    public void takeBreak() {
        System.out.println("Developer is having a coffee break");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Developer is attending a team meeting");
    }
}
