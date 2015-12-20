package me.ibukanov.algs;

import org.junit.Assert;
import org.junit.Test;

public class ArraysFirstIndexesTest {

    @Test
    public void test() {
        String result = ArraysFirstIndexes.alg(
                new int[]{4, -8, 6, 0},
                new int[]{-10, 3, 1, 1}
        );
        Assert.assertEquals("0 1", result.trim());
    }
}
