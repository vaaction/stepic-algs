package me.ibukanov.algs;

import java.util.*;
import java.util.stream.Collectors;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        SegmentsSeparationMeasure.Segment[] points = new SegmentsSeparationMeasure.Segment[count];
        for (int i = 0; i < count; i ++) {
            points[i] = new SegmentsSeparationMeasure.Segment(sc.nextInt(), sc.nextInt());
        }
        System.out.print(new SegmentsSeparationMeasure(points).alg());
    }

    public static class SegmentsSeparationMeasure {
        private final Segment[] segments;
        SegmentsSeparationMeasure(Segment[] segments) {
            this.segments = segments;
        }

        public String alg() {
            Collection<Segment> segmentCollection = Arrays.stream(segments).collect(Collectors.toList());
            Collection<SegmentPoint> points = new ArrayList<>(segments.length * 2);
            segmentCollection.forEach(s -> {
                points.add(new SegmentPoint(s.x, true));
                points.add(new SegmentPoint(s.y, false));
            });
            Object[] sorted = points.stream()
                    .sorted((p1, p2) -> Integer.compare(p1.x, p2.x)).toArray();

            int result = 0;
            int c = 0;
            for (int i = 0; i < sorted.length; i++) {
                if (c == 1)
                    result += ((SegmentPoint)sorted[i]).x - ((SegmentPoint)sorted[i-1]).x;
                if (((SegmentPoint)sorted[i]).isLeft)
                    c++;
                else
                    c--;
            }

            return String.valueOf(result);
        }

        public static class Segment {
            final int x;
            final int y;
            public Segment(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }

        public static class SegmentPoint {
            final int x;
            final boolean isLeft;
            public SegmentPoint(int x, boolean isLeft) {
                this.x = x;
                this.isLeft = isLeft;
            }
        }
    }
}