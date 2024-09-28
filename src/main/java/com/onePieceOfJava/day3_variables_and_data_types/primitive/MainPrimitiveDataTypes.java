package com.onePieceOfJava.day3_variables_and_data_types.primitive;

public class MainPrimitiveDataTypes {
    public static void main(String[] args) {

        //data type => variable name => initialization
        //8 bit
        byte age = 38;
        System.out.println("byte: " + age);

        //16 bit
        short departmentCode = 101;
        System.out.println("short: " + departmentCode);

        char performanceGrade = 'B';
        System.out.println("char: " + performanceGrade);

        //32 bit
        int employeeId = 123456789;
        System.out.println("int: " + employeeId);

        float hourlyRate = 650.75986f;
        System.out.println("float: " + hourlyRate);

        //64 bit
        long sssNumber = 1234567890987654321L;
        System.out.println("long: " + sssNumber);

        double  annualSalary = 1500000.95;
        System.out.println("double: " + annualSalary);

        //boolean
        boolean isFullTime = false;
        System.out.println("boolean: " + isFullTime);


    }
}
