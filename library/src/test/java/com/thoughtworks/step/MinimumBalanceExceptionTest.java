package com.thoughtworks.step;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;

public class MinimumBalanceExceptionTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void throwsInsufficientMinimumBalanceMessage() throws MinimumBalanceException {
        thrown.expect(MinimumBalanceException.class);
        thrown.expectMessage(is("Insufficient minimum balance"));
        throw new MinimumBalanceException();
    }
}