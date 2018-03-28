package com.thoughtworks.step;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AccountNumberGeneratorTest {
    @Test
    public void generatesNineDigitAccNoWithHyphenStartingFromOne() {
        assertThat(AccountNumberGenerator.generateAccNo(),is("0000-0001"));
        assertThat(AccountNumberGenerator.generateAccNo(),is("0000-0002"));
        assertThat(AccountNumberGenerator.generateAccNo(),is("0000-0003"));
    }

    @Test
    public void resetsLastAccNoToZero() {
        AccountNumberGenerator.reset();
        assertThat(AccountNumberGenerator.getAccNoCount(),is(0));
    }
}
