package com.thoughtworks.step;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CreditTransactionTest {
    private Date date;
    private CreditTransaction creditTransaction;
    private String accNo = "0000-0001";
    @Before
    public void setUp() {
        date = new Date();
        creditTransaction = new CreditTransaction(date, new BigDecimal(500),accNo);
        new CreditTransaction(new BigDecimal(300),"0000-0002");
    }

    @Test
    public void getDateShouldGetTheTransactionDate() {
        assertThat(creditTransaction.getDate(),is(date));
    }

    @Test
    public void getAmountShouldGetTransactionAmount() {
        assertThat(creditTransaction.getAmount(),is(new BigDecimal(500)));
    }
    @Test
    public void shouldGetTheAccNoOfTheAccountCreditedTo() {
        assertThat(creditTransaction.creditedTo(),is(accNo));
    }
}
