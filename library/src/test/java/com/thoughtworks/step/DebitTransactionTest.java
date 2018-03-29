package com.thoughtworks.step;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DebitTransactionTest {
    private Date date;
    private DebitTransaction debitTransaction;
    private String accNo = "0000-0001";

    @Before
    public void setUp() {
        date = new Date();
        debitTransaction = new DebitTransaction(date, new BigDecimal(500),accNo);
        new DebitTransaction(new BigDecimal(300),"0000-0002");
    }

    @Test
    public void getDateShouldGetTheTransactionDate() {
        assertThat(debitTransaction.getDate(),is(date));
    }

    @Test
    public void getAmountShouldGetTransactionAmount() {
        assertThat(debitTransaction.getAmount(),is(new BigDecimal(500)));
    }

    @Test
    public void shouldGetTheAccNoOfTheAccountCreditedTo() {
        assertThat(debitTransaction.debitedTo(),is(accNo));
    }
}
