package me.ibukanov.algs;

import java.util.*;

class Main {

    private static int[] values;
    private static int load;
    private static int result = 0;
    private static final PriorityQueue<Integer> queue = new PriorityQueue<>((v1, v2) -> Integer.compare(v2, v1));

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        values = new int[count];
        for (int i = 0; i < count; i++) {
            values[i] = sc.nextInt();
        }
        load = sc.nextInt();
        System.out.print(alg());
    }

    public static String alg() {
        for (int value: values) {
            queue.add(value);
        }

        while (!queue.isEmpty()) {
            take();
            result ++;
        }

        return "" + result;
    }

    private static void take() {
        Collection<Integer> parts = new ArrayList<>();
        int remaining = load;
        while (remaining > 0 && !queue.isEmpty()) {
            int value = queue.poll();

            if (remaining >= value && value != 1) {
                int part = value / 2;
                if (part > 0) {
                    parts.add(part);
                }
            }

            if (remaining < value) {
                parts.add(value);
            }
            remaining = remaining - value;
        }
        queue.addAll(parts);
    }
}