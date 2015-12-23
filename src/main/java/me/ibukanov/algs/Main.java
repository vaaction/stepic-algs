package me.ibukanov.algs;

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();
        System.out.print(alg(a));
    }

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