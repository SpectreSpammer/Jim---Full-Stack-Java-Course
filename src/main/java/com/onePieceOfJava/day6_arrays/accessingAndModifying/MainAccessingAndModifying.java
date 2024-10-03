package com.onePieceOfJava.day6_arrays.accessingAndModifying;

public class MainAccessingAndModifying {
    public static void main(String[] args) {

        String [] employeeNames = {"Jim","Nan","Mugi","Luffy"};
        double [] salary = {50000.75,60000.75,70000.75,80000.75};
        int[] yearsOfService = {7,3,9,2};
        boolean[] isLate = {true,false,false,true};
        int[] hoursWorkedPerWeek = {35,40,45,50};

        // 1. 10% raise for employees which has more than 5 yrs of service
        System.out.println("Applying 10% raise to employees which has more than 5 yrs of service");
        for(int i=0;i < yearsOfService.length;i++){
            if(yearsOfService[i] > 5){
                double originalSalary = salary[i];
                salary[i] *= 1.10; // 10% raise
                System.out.printf("%s received a 10%% raise, Original salary: Php %.2f, New Salary: Php %.2f %n",
                                    employeeNames[i], originalSalary,salary[i]);
            }
        }
        System.out.println();
        //2. Salary deduction of 10% for every late
        System.out.println("Applying 10% salary deduction for late employees");
        for(int i=0;i < employeeNames.length;i++){
            if(isLate[i]){
                double originalSalary = salary[i];
                salary[i] *= 0.90; // 10% deduction
                System.out.printf("%s was late, Original salary: Php %.2f, New Salary: Php %.2f %n ",
                        employeeNames[i], originalSalary,salary[i]);
            }
        }
        System.out.println();
        //updating specific employee working hours
        System.out.println("Updating hours worked for a specific employee");
        int employeeIndex = 0;
        hoursWorkedPerWeek[employeeIndex] = 60;
        System.out.println(employeeNames[employeeIndex] + " s hours worked updated to " + hoursWorkedPerWeek[employeeIndex]);

        for( int hrsPerWeek : hoursWorkedPerWeek){
            System.out.println("hours per week " + hrsPerWeek);
        }
    }
}
