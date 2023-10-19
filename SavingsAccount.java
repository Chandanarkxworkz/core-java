package com.xworkz.yono.sbi.savings;

import com.xworkz.yono.BankAccount;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(){

    }
    public SavingsAccount (double minBalance){
        this.credit((int)minBalance);
    }
    public void calculateInterset() {
        double intrestAccount = intrestRate * getBalance();


    }
}
