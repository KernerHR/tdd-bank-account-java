package org.xpdojo.bank;

public class Account {
    int currentBalance = 0;

    int getBalance() {
        return currentBalance;
    }
    void deposit (int amount) {
        currentBalance += amount;
    }
}