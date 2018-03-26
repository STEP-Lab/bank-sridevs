package com.thoughtworks.step;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;

public class AccountRequirementsTest implements AccountRequirements{
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void checkMinimumBalance() throws MinimumBalanceException{
        thrown.expect(MinimumBalanceException.class);
        thrown.expectMessage(is("Insufficient minimum balance"));
        AccountRequirements.checkMinimumBalance(999);
    }

    @Test
    public void rejectsNonNumericTerms() throws InvalidAccountNumberException {
        thrown.expect(InvalidAccountNumberException.class);
        thrown.expectMessage(is("Invalid account number"));
        AccountRequirements.validateAccountNumber("ABC345678");
    }

    @Test
    public void rejectsAccNoWithoutHyphen() throws InvalidAccountNumberException {
        thrown.expect(InvalidAccountNumberException.class);
        thrown.expectMessage(is("Invalid account number"));
        AccountRequirements.validateAccountNumber("12345678");
    }

    @Test
    public void rejectsNonNineDigitAccNo() throws InvalidAccountNumberException {
        thrown.expect(InvalidAccountNumberException.class);
        thrown.expectMessage(is("Invalid account number"));
        AccountRequirements.validateAccountNumber("1234-56789");
    }
}