package com.thoughtworks.step;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;

public class InvalidAccountNumberExceptionTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void throwsInvalidAccountNumberMessage() throws InvalidAccountNumberException {
        thrown.expect(InvalidAccountNumberException.class);
        thrown.expectMessage(is( "Invalid account number"));
        throw new InvalidAccountNumberException();
    }
}
