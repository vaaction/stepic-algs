package me.ibukanov.algs;

import org.junit.Assert;
import org.junit.Test;

public class ArraysNearestIndexTest {

    @Test
    public void test1() {
        String result = ArraysNearestIndex.alg(
                new int[]{10, 20, 30},
                new int[]{9, 15, 35}
        );
        Assert.assertEquals("0 0 2", result.trim());
    }

    @Test
    public void test2() {
        String result = ArraysNearestIndex.alg(
                new int[]{-100, -5, 10, 20, 30, 784444},
                new int[]{9, 15, 35, -10, 3, 4, 6, -111, -34, 787888}
        );
        Assert.assertEquals("2 2 4 1 2 2 2 0 1 5", result.trim());
    }
}
