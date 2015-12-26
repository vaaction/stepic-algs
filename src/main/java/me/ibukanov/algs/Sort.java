package me.ibukanov.algs;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sort {
    private final IntStream a;
    Sort(IntStream a) {
        this.a = a;
    }

    public Stream<Integer> alg() {
        return a.sorted().mapToObj(Integer::new);
    }
}
