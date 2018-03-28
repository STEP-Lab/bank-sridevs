package com.thoughtworks.step;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;

public class InsufficientBalanceExceptionTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void throwsInsufficientMinimumBalanceMessage() throws InsufficientBalanceException {
        thrown.expect(InsufficientBalanceException.class);
        thrown.expectMessage(is("Insufficient balance"));
        throw new InsufficientBalanceException();
    }
}