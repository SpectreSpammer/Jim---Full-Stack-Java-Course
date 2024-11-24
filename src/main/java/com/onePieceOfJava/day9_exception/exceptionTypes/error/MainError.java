package com.onePieceOfJava.day9_exception.exceptionTypes.error;

import java.util.ArrayList;
import java.util.List;

public class MainError {
    public static void main(String[] args) {
        //Stack Over Flow
        /*
        try{
            recursiveMethod(1);
        }catch (StackOverflowError sofe){
            System.out.println("Caught StackOverflowError: " + sofe.getMessage());
        }
    */
        causeOutOfMemoryError();
    }



    public static void causeOutOfMemoryError() {
        List<byte[]> list = new ArrayList<>();
        while(true){
            list.add(new byte[1024*1024]);
        }
    }

    /*
    public static void recursiveMethod(int i) {
        System.out.println(i);
        recursiveMethod(i+1);
    }
    */

    //out of memory

}
