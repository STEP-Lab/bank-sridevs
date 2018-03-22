package com.thoughtworks.step;

import com.thoughtworks.step.Account;
import com.thoughtworks.step.MinimumBalanceException;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTest {
    private Account harvar;

    @Before
    public void setUp() throws MinimumBalanceException {
        harvar = new Account("8667-3507", 1000);
    }

    @Test
    public void checkBal() {
        assertThat(harvar.getBal(),is((float) 1000));
    }

    @Test(expected = MinimumBalanceException.class)
    public void checkMinimumBalance() throws MinimumBalanceException {
        new Account("8663-3433",999);
    }
}