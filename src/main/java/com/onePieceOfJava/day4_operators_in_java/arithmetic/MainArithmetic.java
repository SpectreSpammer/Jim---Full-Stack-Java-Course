package com.onePieceOfJava.day4_operators_in_java.arithmetic;

public class MainArithmetic {

    public static void main(String[] args) {

        // + - / * %

        String employeeName = "Jim";
        double salary = 50000.75;
        double bonus = 25000.75;
        int yearsOfService = 7;

        //Addition +
        double totalPay = salary + bonus;
        System.out.println("1. Total Pay ( Salary + Bonus ): Php " + totalPay);

        // Subtraction -
        double sss = 4200.75;
        double netPay = totalPay - sss;
        System.out.println("2. Net Pay ( Salary - SSS Deduction ): Php " + netPay);

        // multiplication *
        double annualGrossSalary = salary * 12;
        System.out.println("3. Annual Gross Salary ): Php " + annualGrossSalary);

        // division /
        double averageAnnualSalaryIncrease = salary / yearsOfService;
        System.out.println("4. Average Annual Salary Increase ): Php " + averageAnnualSalaryIncrease);

        // %
        int daysUntilNextPayRaise = 365 % 90;
        System.out.println("5. Days until next pay raise ):  " + daysUntilNextPayRaise);
    }
}
