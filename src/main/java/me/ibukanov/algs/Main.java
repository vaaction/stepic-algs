package me.ibukanov.algs;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String[] line = sc.nextLine().split(" ");
        Stream<Integer> result = new Sort(
                Stream.of(line).mapToInt(Integer::valueOf)
        ).alg();
        result.forEach(i -> System.out.print(i + " "));
    }

    public static class Sort {
        private final IntStream a;
        Sort(IntStream a) {
            this.a = a;
        }

        public Stream<Integer> alg() {
            return a.sorted().mapToObj(Integer::new);
        }
    }
}