/*
 A BankAccount class where the balance should not be accessed directly from outside the class. Instead, you should provide methods to deposit and withdraw money, ensuring the account balance is always correct.
 */

package Encapsulation;

class BankAccount {
    double balance;

    BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            balance = 0;
        }
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
        } else {
            System.out.println("Please enter a valid amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Do not have sufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankProblem {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(5000);
        account1.deposit(300);
        account1.withdraw(200);

        System.out.println("Current balance: " + account1.getBalance());
    }

}
