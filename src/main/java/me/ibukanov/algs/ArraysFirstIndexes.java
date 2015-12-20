package me.ibukanov.algs;

import java.util.HashMap;
import java.util.Map;

public class ArraysFirstIndexes {

    public static String alg(int[] first, int[] second) {
        int i0 = 0;
        int j0 = 0;
        int maxValue = first[0];
        int maxValueIndex = 0;
        Map<Integer, Integer> indexToMaxValue = new HashMap<>(first.length);
        for (int i = 0; i < first.length; i ++) {
            if (first[i] > maxValue) {
                maxValue = first[i];
                maxValueIndex = i;
            }
            indexToMaxValue.put(i, maxValueIndex);
        }
        for (int i = 0; i < second.length; i++) {
            int firstMaxValueIndex = indexToMaxValue.get(i);
            if (first[i0] + second[j0] < first[firstMaxValueIndex] + second[i]) {
                i0 = firstMaxValueIndex;
                j0 = i;
            }
        }
        return i0 + " " + j0;
    }
}
