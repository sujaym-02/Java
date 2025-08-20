package com.xworkz.bank;

import com.xworkz.bank.bankaccount.BankAccount;

public class Bankrunner {
    public static void main(String[] args) {
        BankAccount sujayac = new BankAccount();

        sujayac.credit(20000.00);
        System.out.println("Current Balance :"+sujayac.getBalance());

        BankAccount juviac = new BankAccount();
        sujayac.transfer(juviac,1000.00);

        System.out.println("After Transfering My Balanace :"+sujayac.getBalance());
        System.out.println("After Transfering Juvis Account : "+juviac.getBalance());

    }
}
