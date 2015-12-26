package me.ibukanov.algs;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortTest {

    @Test
    public void test1() {
        Stream<Integer> result = new Sort(
                Stream.of("3 4 1 2 0 9 7 8 6 5 11 12 13 10 14 18 19 16 17 15".split(" "))
                        .mapToInt(Integer::valueOf)
        ).alg();
        Assert.assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]",
                result.collect(Collectors.toList()).toString());
    }
}