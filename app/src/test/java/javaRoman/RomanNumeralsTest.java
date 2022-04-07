package javaRoman;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsTest {
    private RomanNumerals romanNumerals;

    @Before
    public void setUp() throws Exception {
        romanNumerals = new RomanNumerals();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void convertRomanNumeralVto5() {
        String answer = romanNumerals.convertIntToRoman(5);
        Assert.assertEquals("This better turn V into 5 or else", "V", answer);
    }



}