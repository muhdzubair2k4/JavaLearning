package BankApplication.Models;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import BankApplication.Exeptions.*;

public class SmartBankApp {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<String, User> users = new HashMap<>();
    private static User currentUser = null;

    public static void main (String[] args) {
        while (true) {
            System.out.println("Bank Application");
            System.out.println("1. Create User");
            System.out.println("2. Login");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. View Balance");
            System.out.println("6. Exit");
            System.out.println("Choose an option");
            int select = scanner.nextInt();
            scanner.nextLine();

            switch (select) {
                case 1 -> {
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter password: ");
                        String password = scanner.nextLine();
                        System.out.print("Enter age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine(); // consume newline

                        User user = new User(name, password, age); // validate inside constructor
                        users.put(name, user);
                        System.out.println("User created successfully!");
                }

                case 2 -> {
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();

                    User user = users.get(name);
                    if (user != null && user.checkPassword(password)) {
                        currentUser = user;
                        System.out.println("Login successful!");
                    } else {
                        System.out.println("Invalid username or password.");
                    }
                }

                case 3 -> {
                    if (currentUser == null) {
                        System.out.println("Please login first.");
                        continue;
                    }

                    System.out.print("Enter amount to deposit: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); // consume newline
                    currentUser.getAccount().deposit(amount);
                    System.out.println("Deposit successful.");
                }

                case 4 -> {
                    if (currentUser == null) {
                        System.out.println("Please login first.");
                        continue;
                    }

                    System.out.print("Enter amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); // consume newline

                    try {
                        currentUser.getAccount().withdraw(amount);
                        System.out.println("Withdrawal successful.");
                    } catch (InsufficientBalanceException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }

                case 5 -> {
                    if (currentUser == null) {
                        System.out.println("Please login first.");
                        continue;
                    }

                    System.out.println("Current Balance: " + currentUser.getAccount().getBalance());
                }

                case 6 -> {
                    System.out.println("Exiting.\nThank you for using Smart Bank App!");
                    System.exit(0);
                }

                default -> System.out.println("Invalid option. Please choose 1–6.");
            }
        }
    }
}
