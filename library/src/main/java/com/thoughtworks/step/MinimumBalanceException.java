package com.thoughtworks.step;

class MinimumBalanceException extends Throwable {
    MinimumBalanceException() {
        super("Insufficient minimum balance");
    }
}
