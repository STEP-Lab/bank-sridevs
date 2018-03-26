package com.thoughtworks.step;

interface AccountRequirements {
    int MINIMUM_BALANCE = 1000;
    String ACC_NO_PATTERN =  "\\d{4}-\\d{4}";
    static void checkMinimumBalance(float bal) throws MinimumBalanceException {
        if(bal < MINIMUM_BALANCE){
            throw new MinimumBalanceException();
        }
    }

    static void validateAccountNumber(String accNo) throws InvalidAccountNumberException {
        if (!accNo.matches(ACC_NO_PATTERN)) throw new InvalidAccountNumberException();
    }
}
