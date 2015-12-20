package me.ibukanov.algs;

import org.junit.Assert;
import org.junit.Test;

public class MeaniePriorityQueueTest {

    @Test
    public void test1() {
        String result = new MeaniePriorityQueue(new int[]{2, 1, 2}, 2).alg();
        Assert.assertEquals("4", result.trim());
    }

    @Test
    public void test2() {
        String result = new MeaniePriorityQueue(new int[]{4, 3, 5}, 6).alg();
        Assert.assertEquals("5", result.trim());
    }

    @Test
    public void test3() {
        String result = new MeaniePriorityQueue(new int[]{4, 1}, 6).alg();
        Assert.assertEquals("3", result.trim());
    }

    @Test
    public void test4() {
        String result = new MeaniePriorityQueue(new int[]{3, 1}, 4).alg();
        Assert.assertEquals("2", result.trim());
    }
}