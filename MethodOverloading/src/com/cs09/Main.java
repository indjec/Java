package com.cs09;

public class Main {

    public static void main(String[] args) {
        double result = calcFeetAndInchesToCentimeters(6,0);
            if(result < 0)
                System.out.println("Invalid centimeters!!");
         calcFeetAndInchesToCentimeters(157);
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet <0) || ((inches < 0) || (inches > 12)))
            return -1;
        else{
            double centimeters = (feet * 30.48) + (inches * 2.54);
            System.out.println(feet + " feet, " + inches + " inches= " + centimeters + " cm ");
            return centimeters;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0)
            return -1;
        else{
            double feet = (int ) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches ");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
    }
}
