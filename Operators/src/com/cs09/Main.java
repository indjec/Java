package com.cs09;

public class Main {

    public static void main(String[] args) {
        double firstDouble = 20;
        double secondDouble = 80;
        double result = (firstDouble + secondDouble) * 25;
        double remainder = result % 40;
        if(remainder <= 20)
            System.out.println("Total was over the limit !!");
    }
}
