package com.thoughtworks.step;

import java.math.BigDecimal;

class Account implements Validator{
    private String accNo;
    private BigDecimal bal;


    Account(BigDecimal bal) throws MinimumBalanceException, InvalidAccountNumberException {
        this(AccountNumberGenerator.generateAccNo(),bal);
    }

    Account(String accNo, BigDecimal bal) throws MinimumBalanceException, InvalidAccountNumberException {
        validateAccountNumber(accNo);
        this.accNo = accNo;
        checkMinimumBalance(bal);
        this.bal = bal;
    }

    public BigDecimal getBal() {
        return bal;
    }

    public String getAccNo() {
        return accNo;
    }

    public void debit(BigDecimal amount) throws InsufficientBalanceException {
        validateWithdrawal(bal,amount);
        bal = bal.subtract(amount);
    }

    public void credit(BigDecimal amount) {
        bal = bal.add(amount);
    }
}