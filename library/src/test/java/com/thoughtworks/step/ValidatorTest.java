package com.thoughtworks.step;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;

public class ValidatorTest implements Validator {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void checkMinimumBalance() throws MinimumBalanceException{
        thrown.expect(MinimumBalanceException.class);
        thrown.expectMessage(is("Insufficient minimum balance"));
        checkMinimumBalance(new BigDecimal(999));
    }

    @Test
    public void rejectsNonNumericTerms() throws InvalidAccountNumberException {
        thrown.expect(InvalidAccountNumberException.class);
        thrown.expectMessage(is("Invalid account number"));
        validateAccountNumber("ABC345678");
    }

    @Test
    public void rejectsAccNoWithoutHyphen() throws InvalidAccountNumberException {
        thrown.expect(InvalidAccountNumberException.class);
        thrown.expectMessage(is("Invalid account number"));
        validateAccountNumber("12345678");
    }

    @Test
    public void rejectsNonNineDigitAccNo() throws InvalidAccountNumberException {
        thrown.expect(InvalidAccountNumberException.class);
        thrown.expectMessage(is("Invalid account number"));
        validateAccountNumber("1234-56789");
    }

    @Test
    public void rejectsDebitOfAmountgreaterThanBalance() throws InsufficientBalanceException {
        BigDecimal bal = new BigDecimal(1000);
        BigDecimal withdrawalAmount = new BigDecimal(1001);
        thrown.expect(InsufficientBalanceException.class);
        thrown.expectMessage(is("Insufficient balance"));
        validateWithdrawal(bal,withdrawalAmount);
    }
}