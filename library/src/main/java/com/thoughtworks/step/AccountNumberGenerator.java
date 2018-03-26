package com.thoughtworks.step;

abstract class AccountNumberGenerator {
    private static int accNoValue = 0;

    static String generateAccNo() {
        String accNo = String.format("%08d", ++accNoValue);
        return accNo.substring(0,4) + '-' + accNo.substring(4,8);
    }
}
