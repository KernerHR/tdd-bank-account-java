package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
// my first change
public class AccountTest {

    private final Account account = Account.newEmptyAccount();

    @Test
    public void newAccountShallHaveZeroBalance() {
        int amount = account.getBalance();
        assertThat(amount).isZero();
    }

    @Test
    public void newAccountShallHaveStartingBalance() {
        Account newAccountWithBalance = Account.newAccountWithBalance(35);
        int amount = newAccountWithBalance.getBalance();
        assertThat(amount).isEqualTo(35);
    }

    @Test
    public void depositingIncreasesAmount() {
        account.deposit(10);
        int amount = account.getBalance();
        assertThat(amount).isEqualTo(10);

    }

    @Test
    public void depositingMultipleIncreasesAmount() {
        account.deposit(10);
        account.deposit(10);
        int amount = account.getBalance();
        assertThat(amount).isEqualTo(20);

    }
    @Test
    public  void depositingMultipleIncreasesAmountOnMultipleAccounts () {
        account.deposit(10);
        Account account2 = Account.newEmptyAccount();
        account2.deposit(20);
        account.deposit(10);
        account2.deposit(10);
        int amount1 = account.getBalance();
        int amount2 = account2.getBalance();
        assertThat(amount1).isEqualTo(20);
        assertThat(amount2).isEqualTo(30);

    }
}
