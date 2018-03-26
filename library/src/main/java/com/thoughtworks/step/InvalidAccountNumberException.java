package com.thoughtworks.step;

class InvalidAccountNumberException extends Exception {
    InvalidAccountNumberException() {
        super("Invalid account number");
    }
}
