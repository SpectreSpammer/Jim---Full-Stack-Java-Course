package com.onePieceOfJava.day3_variables_and_data_types.reference;

public class MainEmployee {
    public static void main(String[] args) {

        //Object Reference
        Employee developer = new Developer();
        Employee designer = new Designer();
        Employee manager = new Manager();

        //array of employees
        Employee[] employees =  { developer, designer, manager };

        //foreach of employees
        for(Employee employee : employees){
            employee.work();
            employee.takeBreak();
            employee.attendMeeting();
            System.out.println();
        }


    }
}
