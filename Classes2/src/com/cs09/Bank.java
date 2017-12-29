package com.cs09;

public class Bank {
    private int accNum;
    private double balance;
    private String customerName;
    private String email;
    private int phnNum;

    public void getAccNum(int accNum){
        this.accNum = accNum;
    }

    public void getBalance(double balance){
        this.balance = balance;
    }

    public void getCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void getEmail(String email){
        this.email = email;
    }

    public void getPhnNum(int phnNum){
        this.phnNum = phnNum;
    }

    public int setAccNum(){
        return this.accNum;
    }

    public double setBalance(){
        return this.balance;
    }

    public String setCustomerName(){
        return this.customerName;
    }

    public String setEmail(){
        return this.email;
    }

    public int setPhnNum(){
        return this.phnNum;
    }

    public void deposite(double balance){
        this.balance += balance;
        System.out.println("Present balance = " + this.balance);
    }

    public void withdraw(double balance){
        if(this.balance < balance){
            System.out.println("Insufficient balance!!");
        }
        else {
            this.balance -= balance;
            System.out.println("Present balance = " + this.balance);
        }
    }
}
