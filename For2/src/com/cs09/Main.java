package com.cs09;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 10; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Prime Number found is " + i);
                if (count == 3) {
                    System.out.println("Breaking for loop!!");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
