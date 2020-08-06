package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
// my first change
public class AccountTest {

    @Test
    public void newAccountShallHaveZeroBalance() {
        Account account = new Account();
        int amount = account.getBalance();
        assertThat(amount).isZero();
    }

    @Test
    public  void depositingIncreasesAmount () {
        Account account = new Account();
        account.deposit(10);
        int amount = account.getBalance();
        assertThat(amount).isEqualTo(10);

    }
    @Test
    public  void depositingMultipleIncreasesAmount () {
        Account account = new Account();
        account.deposit(10);
        account.deposit(10);
        int amount = account.getBalance();
        assertThat(amount).isEqualTo(20);

    }
    @Test
    public  void depositingMultipleIncreasesAmountOnMultipleAccounts () {
        Account account1 = new Account();
        account1.deposit(10);
        Account account2 = new Account();
        account2.deposit(20);
        account1.deposit(10);
        account2.deposit(10);
        int amount1 = account1.getBalance();
        int amount2 = account2.getBalance();
        assertThat(amount1).isEqualTo(20);
        assertThat(amount2).isEqualTo(30);

    }
}
