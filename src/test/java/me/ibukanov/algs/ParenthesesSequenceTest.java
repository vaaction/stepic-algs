package me.ibukanov.algs;

import org.junit.Assert;
import org.junit.Test;

public class ParenthesesSequenceTest {

    @Test
    public void test1() {
        String result = new ParenthesesSequence("}[[([{[]}".toCharArray()).alg();
        Assert.assertEquals("{}[[([{[]}])]]", result.trim());
    }

    @Test
    public void test2() {
        String result = new ParenthesesSequence("{][[[[{}[]".toCharArray()).alg();
        Assert.assertEquals("IMPOSSIBLE", result.trim());
    }

    @Test
    public void test3() {
        String result = new ParenthesesSequence("{}[[[[{})[]".toCharArray()).alg();
        Assert.assertEquals("IMPOSSIBLE", result.trim());
    }

    @Test
    public void test4() {
        String result = new ParenthesesSequence("{[[[[{}]]])[]".toCharArray()).alg();
        Assert.assertEquals("IMPOSSIBLE", result.trim());
    }

    @Test
    public void test5() {
        String result = new ParenthesesSequence("]()}[](({}".toCharArray()).alg();
        Assert.assertEquals("{[]()}[](({}))", result.trim());
    }

    @Test
    public void test6() {
        String result = new ParenthesesSequence(")[([{[](".toCharArray()).alg();
        Assert.assertEquals("()[([{[]()}])]", result.trim());
    }

    @Test
    public void test7() {
        String result = new ParenthesesSequence("({()}{{}(({{[]{}".toCharArray()).alg();
        Assert.assertEquals("({()}{{}(({{[]{}}}))})", result.trim());
    }
}