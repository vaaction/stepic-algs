package me.ibukanov.algs;

import org.junit.Assert;
import org.junit.Test;

public class PolylineTest {

    @Test
    public void test1() {
        String result = new Polyline(new Polyline.Point[] {
                new Polyline.Point(0, 0),
                new Polyline.Point(1, 1),
                new Polyline.Point(1, 0),
                new Polyline.Point(0, 1)
        }).alg();
        Assert.assertEquals("0 0\n0 1\n1 0\n1 1", result.trim());
    }

    @Test
    public void test2() {
        String result = new Polyline(new Polyline.Point[] {
                new Polyline.Point(0, 0),
                new Polyline.Point(1, 1),
                new Polyline.Point(1, 3),
                new Polyline.Point(2, 5),
                new Polyline.Point(2, 4),
                new Polyline.Point(2, 3),
        }).alg();
        Assert.assertEquals("0 0\n1 1\n1 3\n2 3\n2 4\n2 5", result.trim());
    }
}