package com.thoughtworks.step;

import java.math.BigDecimal;
import java.util.Date;

class CreditTransaction extends Transaction {
    private final String accNo;

    CreditTransaction(Date date, BigDecimal amount, String accNo) {
        super(date,amount);
        this.accNo = accNo;
    }

    CreditTransaction(BigDecimal amount, String accNo) {
        super(amount);
        this.accNo = accNo;
    }

    String creditedTo(){
        return accNo;
    }
}
