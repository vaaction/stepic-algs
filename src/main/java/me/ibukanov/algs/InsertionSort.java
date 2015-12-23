package me.ibukanov.algs;

public class InsertionSort {

    public static String alg(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int tmp = a[i];
            int j = i - 1;
            for (; j >= 0 && tmp < a[j]; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = tmp;
        }
        StringBuilder result = new StringBuilder();
        for (int i: a) {
            result.append(" ").append(i);
        }
        return result.toString().trim();
    }
}
