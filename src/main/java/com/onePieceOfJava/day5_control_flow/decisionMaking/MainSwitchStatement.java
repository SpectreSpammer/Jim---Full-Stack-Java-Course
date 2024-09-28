package com.onePieceOfJava.day5_control_flow.decisionMaking;

public class MainSwitchStatement {
    public static void main(String[] args) {

        String employeeName = "Jim";
        int yearsOfService = 4;


        System.out.println("Employee: " + employeeName);

        //switch to check employee level in your years of service
        switch (yearsOfService){
            case 0:
            case 1:
                System.out.println("Employee Level: Trainee");
                break;
            case 2:
            case 3:
                System.out.println("Employee Level: Junior");
                break;
            case 4:
            case 5:
                System.out.println("Employee Level: Intermediate");
                break;
            case 6:
            case 7:
                System.out.println("Employee Level: Senior");
                break;
            default:
                System.out.println("Employee level: Expert");

        }

        String department = "iT";
        //switch for String
        switch(department.toLowerCase()){
            case "it" :
                System.out.println("IT Department");
                break;
            case "hr":
                System.out.println("HR Department");
                break;
            case "accounting":
                System.out.println("Accounting Department");
                break;
            case "PR":
                System.out.println("Public Relations Department");
                break;
            default:
                System.out.println("No department exist");


        }

    }
}
