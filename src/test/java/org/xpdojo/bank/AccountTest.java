package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
// my first change
public class AccountTest {

    @Test
    public void newAccountShallHaveZeroBalance() {
        Account account = new Account();
        int amount = account.getAmount();
        assertThat(amount).isZero();
    }
}
