package com.onePieceOfJava.day4_operators_in_java.ternary;

public class MainTernary {
    public static void main(String[] args) {

        int age = 28;
        System.out.println( age < 65 ? "Not yet retired" : " retired");


        boolean isReceivedBonus = false;
        String receivedBonus = isReceivedBonus ? "received bonus" : "not yet received the bonus";
        System.out.println("Jim has " + receivedBonus);


    }
}
