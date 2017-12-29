package com.cs09;

public class Main {

    public static void main(String[] args) {
        int number = 5;
        int finishNumber = 60;
        int count = 0;
        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }
            count++;
            System.out.println(number + " is an even number");
            number++;
            if (count == 5) {
                System.out.println("Found five numbers !!");
                break;
            }
        }
        System.out.println("Total even numbers are " + count);
    }

    public static boolean isEvenNumber(int n) {
        if (n % 2 == 0)
            return true;
        else
            return false;
    }
}
