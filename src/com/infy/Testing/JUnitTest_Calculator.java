package com.infy.Testing;

import org.junit.Assert;
import org.junit.Test;

import Calculators.HybridCalc;

public class JUnitTest_Calculator {

    @Test
    public void checkBinary() {
        HybridCalc c1 = new HybridCalc();
        Assert.assertEquals("1010", c1.binaryEquivalent(10));
    }

}

// class JUnitTest_Calculator2 {

// @Test
// public void checkBinary2() {
// HybridCalc c2 = new HybridCalc();
// Assert.assertEquals("100", c2.binaryEquivalent(4));
// }

// }
