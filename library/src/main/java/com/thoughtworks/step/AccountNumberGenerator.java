package com.thoughtworks.step;

abstract class AccountNumberGenerator {
    private static int accNoCount = 0;

    static String generateAccNo() {
        String accNo = String.format("%08d", ++accNoCount);
        return accNo.substring(0,4) + '-' + accNo.substring(4,8);
    }

    public static Object getAccNoCount() {
        return accNoCount;
    }

    public static void reset() {
        accNoCount = 0;
    }
}
