package com.infy.Testing;

import org.junit.Assert;
import org.junit.Test;

import Calculators.HybridCalc;

public class JUnitTest_Calculator2 {

    @Test
    public void checkHexa() {
        HybridCalc c2 = new HybridCalc();
        Assert.assertEquals("a", c2.hexaEquivalent(10));
    }
}
