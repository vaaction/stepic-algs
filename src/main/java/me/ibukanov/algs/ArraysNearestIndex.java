package me.ibukanov.algs;

public class ArraysNearestIndex {

    public static String alg(int[] A, int[] B) {
        StringBuilder result = new StringBuilder();
        for (int bi: B) {
            result.append(nearestIndex(bi, A)).append(" ");
        }
        return result.toString();
    }

    private static int nearestIndex(int bi, int[] a) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < bi) {
                low = mid + 1;
                if (low > a.length - 1) {
                    return a.length - 1;
                }
            } else if (midVal > bi) {
                high = mid - 1;
                if (high < 0) {
                    return 0;
                }
            } else
                return mid;
        }

        if (Math.abs(a[low] - bi) < Math.abs(a[high] - bi)) {
            return low;
        } else {
            return high;
        }
    }
}
