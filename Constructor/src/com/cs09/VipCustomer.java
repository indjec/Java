package com.cs09;

public class VipCustomer {
    private String name;
    private String email;
    private double creditLimit;

    public VipCustomer(){
        this("Clarke", "tim@tim.com", 5600.77);
    }

    public VipCustomer(String email, double creditLimit){
        this("Kent" , email, creditLimit);
    }

    public VipCustomer(String name, String email, double creditLimit){
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public double getCreditLimit(){
        return this.creditLimit;
    }
}
