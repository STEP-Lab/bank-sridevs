package com.thoughtworks.step;

public class Account {
    private final String accNo;
    private final float bal;
    private final float MINIMUM_BALANCE = 1000;

    public Account(String accNo, float bal) throws MinimumBalanceException {
        this.accNo = accNo;
        if(bal < MINIMUM_BALANCE){
            throw new MinimumBalanceException();
        }
        this.bal = bal;
    }

    public Object getBal() {
        return bal;
    }
}