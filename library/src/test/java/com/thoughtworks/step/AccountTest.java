package com.thoughtworks.step;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTest {
    private Account harvar;
    private Account sridev;

    @Before
    public void setUp() throws MinimumBalanceException, InvalidAccountNumberException {
        harvar = new Account(1000);
        sridev = new Account(2000);
    }

    @Test(expected = MinimumBalanceException.class)
    public void reportsMinimumBalanceException() throws MinimumBalanceException, InvalidAccountNumberException {
        new Account(999);
    }

    @Test(expected = InvalidAccountNumberException.class)
    public void reportsInvalidAccNoException() throws MinimumBalanceException, InvalidAccountNumberException {
        new Account("233",1000);
    }

    @Test
    public void checkBal() {
        assertThat(harvar.getBal(),is((float) 1000));
        assertThat(sridev.getBal(),is((float) 2000));
    }


    @Test
    public void checkAccNo() {
        assertThat(harvar.getAccNo(),is( "0000-0001"));
        assertThat(sridev.getAccNo(),is( "0000-0002"));
    }
}