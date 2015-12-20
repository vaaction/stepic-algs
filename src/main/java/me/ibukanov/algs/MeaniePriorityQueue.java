package me.ibukanov.algs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.PriorityQueue;

public class MeaniePriorityQueue {

    private final int[] values;
    private final int load;
    private int result = 0;
    private final PriorityQueue<Integer> queue = new PriorityQueue<>((v1, v2) -> Integer.compare(v2, v1));

    MeaniePriorityQueue(int[] values, int load) {
        this.values = values;
        this.load = load;
    }

    public String alg() {
        for (int value: values) {
            queue.add(value);
        }

        while (!queue.isEmpty()) {
            take();
            result ++;
        }

        return "" + result;
    }

    private void take() {
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
