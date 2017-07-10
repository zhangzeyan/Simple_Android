package com.simple.android;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    Calculator mCalculator;

    @Before
    public void setup() {
        if (mCalculator == null)
             mCalculator = new Calculator();
    }

    @Test
    public void testAdd() throws Exception {
        int sum = mCalculator.add(18, 6);
        assertEquals(24, sum);
    }

    @Test
    public void testMultiply() throws Exception {
        int product = mCalculator.multiply(18, 6);
        assertEquals(108, product);
    }

    @Test
    public void testSubtract() throws Exception {
        int product = mCalculator.subtract(18, 6);
        assertEquals(12, product);
    }


    @Test
    public void testubtract() throws Exception {
        int product = mCalculator.divide(18, 6);
        assertEquals(3, product);
    }
}