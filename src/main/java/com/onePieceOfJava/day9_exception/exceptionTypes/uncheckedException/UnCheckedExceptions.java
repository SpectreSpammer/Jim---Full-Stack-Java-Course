package com.onePieceOfJava.day9_exception.exceptionTypes.uncheckedException;

public class UnCheckedExceptions {
    public static void main(String[] args) {

        /*
        String name = null;
        System.out.println(name.length());
        */
        //Null Pointer Exception
        try{
            String name = null;
            System.out.println(name.length());
        }catch (NullPointerException npe){
            System.out.println("Caught NullPointerException: " + npe.getMessage());
        }


        //Array Index Out of Bounds
        /*
        int[] workingHours = new int[5];
        System.out.println(workingHours[6]);
        */

        try{
            int[] workingHours = new int[5];
            System.out.println(workingHours[6]);
        }catch (ArrayIndexOutOfBoundsException aiobe){
            System.out.println("Caught NullPointerException: " + aiobe.getMessage());
        }
    }
}
