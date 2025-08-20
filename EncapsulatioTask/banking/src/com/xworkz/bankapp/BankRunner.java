package com.xworkz.bankapp;

import com.xworkz.bankapp.bankaccount.BankAccount;

public class BankRunner {
    public static void main(String[] args) {
        BankAccount prajuAccount = new BankAccount();
        prajuAccount.credit(50_000);
        prajuAccount.getBalance();

        BankAccount jashAccount = new BankAccount();

        jashAccount.transfer(jashAccount,100);


        System.out.println("THE BALANCE ON MY ACCOUNT "+prajuAccount.getBalance());
        System.out.println("THE BALANCE ON FRIENDS ACCOUNT "+jashAccount.getBalance());
    }
}
