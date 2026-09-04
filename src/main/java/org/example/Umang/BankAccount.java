package org.example.Umang;

public class BankAccount {
         private int balance;
         private String accountNumber;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public BankAccount(int balance, String accountNumber){
        this.balance=balance;
        this.accountNumber=accountNumber;
    }

    public int withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
            return balance;
        }
        balance -= amount;
        return balance;
    }
}
class User{
    static void main() {
        BankAccount newBankAccount = new BankAccount(50000, "BOB2003");
        System.out.println(newBankAccount.withdraw(10000));
    }
}