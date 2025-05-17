package BankApplication.Models;

import BankApplication.Exeptions.InsufficientBalanceException;

public class BankAccount {



    private double balance;

    public double getBalance() {return balance;}

    public BankAccount(double balance) {this.balance = 0.0;}


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount has been Deposited to Your Account");
        } else {
            System.out.println("Invalid Amount Entered");
        }
    }

    public void withdraw (double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Your Account has not Sufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Amount has been withdraw from Your Account");
        }
    }



}