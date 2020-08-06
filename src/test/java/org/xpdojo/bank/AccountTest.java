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
}
