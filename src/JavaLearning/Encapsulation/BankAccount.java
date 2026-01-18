package JavaLearning.Encapsulation;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public void setBalance(double balance) {
        this.balance = (balance >= 0) ? balance : 0;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount " +amount +" added to balance");
    }
}

class MainBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.setBalance(200.11);

        bankAccount.deposit(15600);
        System.out.println("Now your Current Balance is : " + bankAccount.getBalance());
    }
}
