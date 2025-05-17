package BankApplication.Models;

import BankApplication.Exeptions.InvalidAgeException;
import BankApplication.Exeptions.WeekPasswordException;

public class User {
    private String name;
    private String password;
    private int age;
    private BankAccount Account;

    public User(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public void User(String name, String password, int age, BankAccount account) throws InvalidAgeException, WeekPasswordException {
        if (age < 18) {
            throw new InvalidAgeException ("Your Age is Invalid");
        }
        if (password.length() <  6) {
            throw new WeekPasswordException("Your Password is Weak");
        }
        else {
            this.name = name;
            this.password = password;
            this.age = age;
            Account = account;
        }
    }

    public boolean isStrongPassword(String password) {
        if (password.length() > 6 && password.matches(".*[0-9!@#$%^&*()].*")) {
            return true;
        }
        return false;
    }




    public String getName() {return name;}
    public int getAge() {return age;}


    public BankAccount getAccount() {
        return Account;
    }


    public boolean checkPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }
}
