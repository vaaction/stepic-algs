package me.ibukanov.algs;

import java.util.*;
import java.util.stream.Collectors;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        Polyline.Point[] points = new Polyline.Point[count];
        for (int i = 0; i < count; i ++) {
            points[i] = new Polyline.Point(sc.nextInt(), sc.nextInt());
        }
        System.out.print(new Polyline(points).alg());
    }

    public static class Polyline {
        private final Point[] points;
        Polyline(Point[] points) {
            this.points = points;
        }

        public String alg() {
            Collection<Point> polyline = Arrays.stream(points).sorted((p1, p2) -> {
                if (p1.x < p2.x) return -1;
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
}