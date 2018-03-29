package com.thoughtworks.step;

import java.math.BigDecimal;
import java.util.Date;

class DebitTransaction extends Transaction {
    private final String accNo;

    DebitTransaction(Date date, BigDecimal amount, String accNo) {
        super(date,amount);
        this.accNo = accNo;
    }

    DebitTransaction(BigDecimal amount, String accNo) {
        super(amount);
        this.accNo = accNo;
    }

    String debitedTo(){
        return accNo;
    }
}
