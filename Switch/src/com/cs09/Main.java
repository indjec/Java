package com.cs09;

public class Main {

    public static void main(String[] args) {
//        int switchValue = 2;
//        switch (switchValue) {
//            case 1:
//                System.out.println("1");
//                 break;
//            case 2:
//                System.out.println("2");
//                 break;
//            case 3:
//                System.out.println("3");
//                break;
//            case 4:
//                System.out.println("4");
//                break;
//        }

        char switchValue = 'C';
        switch (switchValue){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(switchValue + " was found");
                break;
            default:
                System.out.println("Not found!!");
        }
    }
}
