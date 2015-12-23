package me.ibukanov.algs;


import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {

    @Test
    public void test1() {
        String result = InsertionSort.alg(new int[]{3, 1, 2});
        Assert.assertEquals("1 2 3", result.trim());
    }
}
