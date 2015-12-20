package me.ibukanov.algs;

import java.util.stream.IntStream;

public class NumberDecomposition {

    public static String alg(int n) {
        for(int i: IntStream.rangeClosed(2, n).toArray()) {
            if (n % i == 0) {
                return i + " " + alg(n / i);
            }
        }
        return "";
    }
}
