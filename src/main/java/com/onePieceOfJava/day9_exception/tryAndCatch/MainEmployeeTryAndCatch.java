package com.onePieceOfJava.day9_exception.tryAndCatch;

public class MainEmployeeTryAndCatch {
    public static void main(String[] args) {
        EmployeeTryAndCatch emp = new EmployeeTryAndCatch("Jimson",70000.75);

        try{
            //valid
            emp.raiseSalary(10);
            System.out.println("10% raise is successful");

            //invalid
            emp.raiseSalary(101);
            System.out.println("This line wont be executed");
        }catch (IllegalArgumentException iae){
            System.out.println("IllegalArgumentException: " +  iae);
        }finally {
            System.out.println("Salary processing completed.");
        }


        emp.raiseSalary(10);
        System.out.println("10% raise is successful");

        //invalid
        emp.raiseSalary(-10);
        System.out.println("This line wont be executed");



    }
}
