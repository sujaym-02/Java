package com.xworkz.bankapp.bankaccount;

public class BankAccount {

    private double balance;

    public double getBalance() {
        return balance;
    }
    public  void credit(double amount) {
        boolean check = amount > 0.00;
        if (check) {
            balance = amount + balance;
            System.out.println("CREDITED AN AMOUNT OF " + amount);
        } else {
            System.out.println("Amount has to be greater than zero");
        }
    }

    public void debit(double amount) {
        boolean check = amount <= balance;
        if (check) {
            balance = balance - amount;
            System.out.println("DEBITED AMOUNT IS " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void transfer(BankAccount beneficiaryAccount,double amount){
        this.debit(amount);
        beneficiaryAccount.credit(amount);
    }

}
