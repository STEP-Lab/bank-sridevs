package com.thoughtworks.step;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTest {
    private Account harvar;
    private Account sridev;

    @Before
    public void setUp() throws MinimumBalanceException, InvalidAccountNumberException {
        harvar = new Account(new BigDecimal(1000));
        sridev = new Account(new BigDecimal(2000));
    }

    @Test(expected = MinimumBalanceException.class)
    public void reportsMinimumBalanceException() throws MinimumBalanceException, InvalidAccountNumberException {
        new Account(new BigDecimal(999));
    }

    @Test(expected = InvalidAccountNumberException.class)
    public void reportsInvalidAccNoException() throws MinimumBalanceException, InvalidAccountNumberException {
        new Account("233",new BigDecimal(1000));
    }

    @Test
    public void checkBal() {
        assertThat(harvar.getBal(),is((new BigDecimal(1000)) ));
        assertThat(sridev.getBal(),is((new BigDecimal(2000)) ));
    }


    @Test
    public void checkAccNo() {
        assertThat(harvar.getAccNo(),is( "0000-0001"));
        assertThat(sridev.getAccNo(),is( "0000-0002"));
    }

    @Test
    public void checkDebit() throws InsufficientBalanceException {
        sridev.debit(new BigDecimal(500));
        assertThat(sridev.getBal(),is(new BigDecimal(1500)));
    }
}