package me.ibukanov.algs;

import org.junit.Assert;
import org.junit.Test;

public class SegmentsSeparationMeasureTest {

    @Test
    public void test1() {
        String result = new SegmentsSeparationMeasure(new SegmentsSeparationMeasure.Segment[] {
                new SegmentsSeparationMeasure.Segment(1, 4),
                new SegmentsSeparationMeasure.Segment(7, 8),
                new SegmentsSeparationMeasure.Segment(2, 5)
        }).alg();
        Assert.assertEquals("3", result.trim());
    }
}