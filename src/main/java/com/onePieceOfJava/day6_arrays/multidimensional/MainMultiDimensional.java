package com.onePieceOfJava.day6_arrays.multidimensional;

public class MainMultiDimensional {
    public static void main(String[] args) {
        Object [][] employeeData = {
                // id, name, salary, hours per week, hourly rate,  bonus, yrs of service, is late
                { 101,"Jim", 50000.75, 40, 250.75 ,25000.75,7,false},
                { 102, "Nan",60000.75,45, 500.75, 20000.75, 5, false},
                { 103, "Nami",70000.75,45, 600.75, 35000.75, 9, false},
                { 103, "Robin",80000.75,45, 800.75, 15000.75, 2, false}
        };
        System.out.println("1. --- Printing all the employees data ----");
        displayEmployeeInfo(employeeData);
        System.out.println();
        // 1. raise employee who has 5 yrs of service by 10%
        System.out.println("2. -- 10% increase > 10 yrs of experience");
        for(int i=0; i< employeeData.length;i++){
            if((int)employeeData[i][6] > 5){
                double originalSalary = (double) employeeData[i][2];
                employeeData[i][2] = (double) employeeData[i][2] * 1.10;
                System.out.printf("%s received 10%% raise, Original Salary: Php %.2f, New Salary: Php %.2f %n",
                        employeeData[i][1], originalSalary,employeeData[i][2]);
            }
        }

        System.out.println("3. -- 10% deduction for those late");
        for(int i=0; i< employeeData.length;i++){
            if((boolean)employeeData[i][7] ){
                double originalSalary = (double) employeeData[i][2];
                employeeData[i][2] = (double) employeeData[i][2] * 0.90;
            }
        }

        System.out.println("4. -- Updating specific employees working hours");
        int employeeIndex = 0;
        employeeData[employeeIndex][3] = 60;
        System.out.println(employeeData[employeeIndex][1] + " hours worked updated to: " + employeeData[employeeIndex][3]);


        System.out.println("5. -- Increment years of service to all employees ");
        for(int i=0; i< employeeData.length;i++){
            employeeData[i][6] = (int)employeeData[i][6] + 1;
            System.out.println(employeeData[i][1] + " updated years of service to: " + employeeData[i][6]);
        }
        displayEmployeeInfo(employeeData);
    }

    private static void displayEmployeeInfo(Object [][] data) {
        for(Object[] employee : data){
            System.out.println("Employee Id: " + employee[0]);
            System.out.println("Employee Name: " + employee[1]);
            System.out.println("Employee Salary: " + employee[2]);
            System.out.println("Hours Per week: " + employee[3]);
            System.out.println("Hourly Rate: " + employee[4]);
            System.out.println("Bonus: " + employee[5]);
            System.out.println("Years of Service: " + employee[6]);
            System.out.println("Is Late/ : " + employee[7]);
            System.out.println();
        }
    }


}
