package com.thoughtworks.step;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

class Transaction {
    private final Date date;
    private final BigDecimal amount;

    Transaction(BigDecimal amount) {
       this(new Date(),amount);
    }

    Transaction(Date date, BigDecimal amount) {
        this.date = date;
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction)) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(getDate(), that.getDate()) &&
                Objects.equals(getAmount(), that.getAmount());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getDate(), getAmount());
    }
}
