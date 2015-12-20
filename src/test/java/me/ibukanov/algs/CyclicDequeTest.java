package me.ibukanov.algs;

import org.junit.Assert;
import org.junit.Test;

public class CyclicDequeTest {

    @Test
    public void test1() {
        String result = new CyclicDeque().alg(
                5,
                new int[][]{{1, 44}, {3, 50}, {2, 44}, {2, 50}, {2, -1}}
        );
        Assert.assertEquals("YES", result.trim());
    }

    @Test
    public void test2() {
        String result = new CyclicDeque().alg(
                5,
                new int[][]{{1, 44}, {3, 50}, {2, 44}, {2, 50}, {4, -1}}
        );
        Assert.assertEquals("YES", result.trim());
    }

    @Test
    public void test3() {
        String result = new CyclicDeque().alg(
                5,
                new int[][]{{1, 44}, {3, 50}, {4, 50}, {2, 44}, {4, -1}}
        );
        Assert.assertEquals("YES", result.trim());
    }

    @Test
    public void test4() {
        String result = new CyclicDeque().alg(
                5,
                new int[][]{{1, 44}, {3, 50}, {2, 44}, {2, 50}, {2, -1}}
        );
        Assert.assertEquals("YES", result.trim());
    }

    @Test
    public void test5() {
        String result = new CyclicDeque().alg(
                2,
                new int[][]{{1, 10}, {2, -1}}
        );
        Assert.assertEquals("NO", result.trim());
    }
}