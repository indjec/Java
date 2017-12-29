package com.cs09;

public class Main {

    public static void main(String[] args) {
        VipCustomer person = new VipCustomer();
        System.out.println("Name = " + person.getName());
        System.out.println("Email = " + person.getEmail());
        System.out.println("Credit Limit = " + person.getCreditLimit());
    }
}
