package me.ibukanov.algs;

import org.junit.Assert;
import org.junit.Test;

public class NumberDecompositionTest {

    @Test
    public void test() {
        String result = NumberDecomposition.alg(75);
        Assert.assertEquals("3 5 5", result.trim());
    }
}
