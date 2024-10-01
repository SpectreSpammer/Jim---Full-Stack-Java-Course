package com.onePieceOfJava.day5_control_flow.loopStatement;

public class MainWhile {
    public static void main(String[] args) {

        int yearsOfService = 3;
        int performanceRating = 3;
        boolean isPromotionEligible =true;

        //true
        while(!isPromotionEligible){
            // false ||                 true
           if(yearsOfService >= 10 || (yearsOfService >=5 && performanceRating >=7)){
               isPromotionEligible = true;
               System.out.println("Employee is now eligible for promotion");
            }else {
               yearsOfService++;
               System.out.println("Years of service " + yearsOfService);
           }


        }
    }
}
