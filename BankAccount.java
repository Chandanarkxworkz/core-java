package com.xworkz.yono; //standar or use defin pack 2 types buil in  // java.lang is a default-magic pack System/string

public class BankAccount {
    private double balance;
    public void debit(int amount){
        if(amount<=balance){
        balance=balance-amount;
        System.out.println("remaining balance is " +balance);

    }

}
public void credit(int amount){ //current funct modules folder
    System.out.println("crediting amount ");
    this.balance=balance+amount;
    }
    public void transfer(int amount,BankAccount benificiaryAccount){
        this.debit(amount);
        benificiaryAccount.credit(amount);
    }
    public double getBalance(){
        return balance;
    }
}
