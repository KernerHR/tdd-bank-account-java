package org.xpdojo.bank;

public class Account {
    int currentBalance = 0;

    private Account() {
    }

    public static Account newEmptyAccount() {
        return new Account();
    }

    public static Account newAccountWithBalance(int amount) {
        Account account = new Account();
        account.deposit(amount);
        return account;
    }

    int getBalance() {
        return currentBalance;
    }

    void deposit(int amount) {
        currentBalance += amount;
    }
}