package com.thoughtworks.step;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTest {
    private Account harvar;
    private Account sridev;

    @Before
    public void setUp() throws MinimumBalanceException {
        harvar = new Account(1000);
        sridev = new Account(2000);
    }

    @Test
    public void checkBal() {
        assertThat(harvar.getBal(),is((float) 1000));
        assertThat(sridev.getBal(),is((float) 2000));
    }

    @Test(expected = MinimumBalanceException.class)
    public void checkMinimumBalance() throws MinimumBalanceException {
        new Account(999);
    }


    @Test
    public void checkAccNo() {
        assertThat(harvar.getAccNo(),is( "SBI-0001"));
        assertThat(sridev.getAccNo(),is( "SBI-0002"));
    }
}