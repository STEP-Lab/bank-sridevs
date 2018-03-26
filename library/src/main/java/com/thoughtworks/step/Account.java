package com.thoughtworks.step;

public class Account {
    private String accNo;
    private float bal;
    private static int accNoSuffix = 0;

    Account(float bal) throws MinimumBalanceException {
        final String accNoPrefix = "SBI-";
        this.accNo = accNoPrefix + String.format("%04d", ++accNoSuffix);
        int MINIMUM_BALANCE = 1000;
        if(bal < MINIMUM_BALANCE){
            throw new MinimumBalanceException();
        }
        this.bal = bal;
    }


    public Object getBal() {
        return bal;
    }

    public String getAccNo() {
        return accNo;
    }
}