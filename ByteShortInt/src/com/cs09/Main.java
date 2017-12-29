package com.cs09;

public class Main {

    public static void main(String[] args) {
	    byte myByte = 20;
	    short myShort = 30;
	    int myInt = 40;
	    long myLong = 50000L + 10 * (myByte + myInt + myShort);
	    System.out.println("Long Total = " + myLong);
	    char reg = '\u00AE';
		System.out.println(reg);
    }
}
