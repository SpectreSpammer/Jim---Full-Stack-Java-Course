package com.onePieceOfJava.day7_methods;

public class MainMethods {
    public static void main(String[] args) {

        displayEmployeeInfo("Jim", 28);
        System.out.println();
        ExampleMain.message();
        System.out.println();

        double salaryWithoutBonus = calculateSalary(40, 2500.75);
        System.out.println("Method overloading with the same name with different parameter");
        System.out.println("Jim has a salary of " + salaryWithoutBonus);
        System.out.println();

        double salaryWithBonus = calculateSalary(45, 3500.75, 10000.75);
        System.out.println("Nan has a salary of " + salaryWithBonus);
        System.out.println();

        System.out.println("Method overloading using switch");
        System.out.println("Performance Key  Evaluation");
        System.out.println(" ---  " + calculateSalary("GoOd", 100030));
    }

    private static String calculateSalary(String performanceRating, double salary) {
        double bonusPercentage;
        switch (performanceRating.toLowerCase()){
            case "excellent":
                bonusPercentage = 0.1;
                break;
            case "good":
                bonusPercentage = 0.05;
                break;
            default:
                bonusPercentage = 0.02;
                performanceRating = "average";
        }

        double totalAmount = salary * bonusPercentage;
        return  String.format("Total new Salarry is: Php %.2f ( Performance Rating: %s",
                totalAmount, performanceRating);

    }

    private static double calculateSalary(int hoursWorked, double hourlyRate) {
        return hoursWorked * hourlyRate;
    }

    private static double calculateSalary(int hoursWorked, double hourlyRate, double bonus ) {
        return hoursWorked * hourlyRate + bonus;
    }

    private static void displayEmployeeInfo(String name, int age) {
        System.out.println(" 1. Void with no return value");
        System.out.println(" --- Employee name: " + name);
        System.out.println(" --- Employee age: " + age);
    }
}
