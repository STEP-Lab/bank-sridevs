package com.thoughtworks.step;

class InsufficientBalanceException extends Throwable {
    InsufficientBalanceException() { super("Insufficient balance"); }
}
