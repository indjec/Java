package com.cs09;

public class Main {

    public static void main(String[] args) {
	    Bank person = new Bank();
	    person.getCustomerName("Tim");
	    person.getAccNum(12345678);
	    person.getBalance(9000.89);
	    person.getEmail("abc@abc.com");
	    person.getPhnNum(999900000);

        System.out.println("Account Number = " + person.setAccNum());
        System.out.println("Customer Name = " + person.setCustomerName());
        System.out.println("Balance = " + person.setBalance());
        System.out.println("Email = " + person.setEmail());
        System.out.println("Phone Number = " + person.setPhnNum());

        person.deposite(1000);
        person.withdraw(20000);
    }
}
