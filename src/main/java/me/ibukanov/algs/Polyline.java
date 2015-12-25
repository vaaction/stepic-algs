package me.ibukanov.algs;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Polyline {
    private final Point[] points;
    Polyline(Point[] points) {
        this.points = points;
    }

    public String alg() {
        Collection<Point> polyline = Arrays.stream(points).sorted((p1, p2) -> {
            if (p1.x == p2.x) return -1;
            if (p1.x > p2.x) return +1;
            if (p1.y < p2.y) return -1;
            if (p1.y > p2.y) return +1;
            return 0;
        }).collect(Collectors.toList());
        StringBuilder r = new StringBuilder();
        polyline.forEach(p -> r.append(p.x).append(" ").append(p.y).append("\n"));
        return r.toString();
    }

    public static class Point {
        final int x;
        final int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
