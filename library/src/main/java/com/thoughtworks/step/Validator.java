package com.thoughtworks.step;

import java.math.BigDecimal;

interface Validator {
    BigDecimal MINIMUM_BALANCE = new BigDecimal(1000);
    String ACC_NO_PATTERN =  "\\d{4}-\\d{4}";
    default void checkMinimumBalance(BigDecimal bal) throws MinimumBalanceException {
        if(bal.compareTo(MINIMUM_BALANCE) < 0){
            throw new MinimumBalanceException();
        }
    }

    default void validateAccountNumber(String accNo) throws InvalidAccountNumberException {
        if (!accNo.matches(ACC_NO_PATTERN)) throw new InvalidAccountNumberException();
    }


    default void validateWithdrawal(BigDecimal bal, BigDecimal withdrawalAmount) throws InsufficientBalanceException {
        if(withdrawalAmount.compareTo(bal) > 0) throw new InsufficientBalanceException();
    }
}
