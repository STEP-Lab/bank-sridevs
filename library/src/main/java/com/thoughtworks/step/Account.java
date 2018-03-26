package com.thoughtworks.step;

public class Account implements AccountRequirements{
    private String accNo;
    private float bal;


    Account(float bal) throws MinimumBalanceException, InvalidAccountNumberException {
        this(AccountNumberGenerator.generateAccNo(),bal);
    }

    Account(String accNo,float bal) throws MinimumBalanceException, InvalidAccountNumberException {
        AccountRequirements.validateAccountNumber(accNo);
        this.accNo = accNo;
        AccountRequirements.checkMinimumBalance(bal);
        this.bal = bal;
    }

    public float getBal() {
        return bal;
    }

    public String getAccNo() {
        return accNo;
    }
}