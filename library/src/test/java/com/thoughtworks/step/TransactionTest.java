package com.thoughtworks.step;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TransactionTest {
    private Date date;
    private Transaction transaction;
    @Before
    public void setUp() {
         date = new Date();
         transaction = new Transaction(date, new BigDecimal(500));
    }

    @Test
    public void getDateShouldGetTheTransactionDate() {
        assertThat(transaction.getDate(),is(date));
    }

    @Test
    public void getAmountShouldGetTransactionAmount() {
        assertThat(transaction.getAmount(),is(new BigDecimal(500)));
    }
}
