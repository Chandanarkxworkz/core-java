package com.xworkz.yono;

import com.xworkz.yono.sbi.savings.SavingsAccount;

public class BankExecutor {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount ();

        myAccount.credit( 5000);
        myAccount.credit(300);
        myAccount.debit(200);
        System.out.println("available balance " + myAccount.getBalance());
        BankAccount account = new SavingsAccount(10000);
        SavingsAccount mySavingAccount = (SavingsAccount)myAccount;
        mySavingAccount.calculateInterset();
        System.out.println("balance after interest rate " + mySavingAccount);
        System.out.println("available balance " + myAccount.getBalance());

        //type casting - up /polymorphism

        SavingsAccount friendsAccount = new SavingsAccount();

        myAccount.transfer(200 , friendsAccount);
        System.out.println("transfering 2000 to my friends account");
        System.out.println("available balance on my account " + myAccount.getBalance());
        System.out.println("available balance on friends account" + friendsAccount.getBalance());

        SavingsAccount ammaAccount = new SavingsAccount();

        myAccount.transfer(900,ammaAccount);
        System.out.println("transfering 900 to my amma  account");
        System.out.println("available balance on my account " + myAccount.getBalance());
        System.out.println("available balance on amma account" + ammaAccount.getBalance());

        SavingsAccount pavanAccount = new SavingsAccount();

        myAccount.transfer(600,pavanAccount);
        System.out.println("transferring 600 to my pavan  account");
        System.out.println("available balance on my account " + myAccount.getBalance());
        System.out.println("available balance on pavan account" + pavanAccount.getBalance());

        SavingsAccount uncleAccount = new SavingsAccount();

        myAccount.transfer(100,uncleAccount);
        System.out.println("transferring 100 to my uncle  account");
        System.out.println("available balance on my account " + myAccount.getBalance());
        System.out.println("available balance on uncle account" + uncleAccount.getBalance());

        SavingsAccount cousinAccount = new SavingsAccount();

        myAccount.transfer(300,cousinAccount);
        System.out.println("transferring 300 to my cousin  account");
        System.out.println("available balance on my account " + myAccount.getBalance());
        System.out.println("available balance on cousin account" + cousinAccount.getBalance());

        SavingsAccount libraryAccount = new SavingsAccount();

        myAccount.transfer(930,libraryAccount);
        System.out.println("transferring 930 to my library account");
        System.out.println("available balance on my account " + myAccount.getBalance());
        System.out.println("available balance on library account" + libraryAccount.getBalance());

        SavingsAccount postofficeAccount = new SavingsAccount();

        myAccount.transfer(250,postofficeAccount);
        System.out.println("transferring 2" +
                "50 to my post office  account");
        System.out.println("available balance on my account " + myAccount.getBalance());
        System.out.println("available balance on postoffice account" + postofficeAccount.getBalance());

        SavingsAccount fatherAccount = new SavingsAccount();

        myAccount.transfer(600,fatherAccount);
        System.out.println("transferring 600 to my father  account");
        System.out.println("available balance on my account " + myAccount.getBalance());
        System.out.println("available balance on father account" + fatherAccount.getBalance());

        SavingsAccount sisterAccount = new SavingsAccount();

        myAccount.transfer(500,sisterAccount);
        System.out.println("transferring 500 to my sister  account");
        System.out.println("available balance on my account " + myAccount.getBalance());
        System.out.println("available balance on sister account" + sisterAccount.getBalance());














    }
}
