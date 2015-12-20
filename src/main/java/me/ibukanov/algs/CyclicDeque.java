package me.ibukanov.algs;

import java.util.LinkedList;

public class CyclicDeque {

    private boolean hasError = false;
    private LinkedList<Integer> dec = new LinkedList<>();

    public String alg(int count, int[][] values) {
        int index = 0;
        while (index < count) {
            command(values[index][0], values[index][1]);
            index ++;
        }

        if (hasError) {
            return "NO";
        } else {
            return "YES";
        }
    }

    private void command(int command, int value) {
        switch (command) {
            case 1:
                dec.addFirst(value);
                return;
            case 2:
                checkPollValue(dec.pollFirst(), value);
                return;
            case 3:
                dec.addLast(value);
                return;
            case 4:
                checkPollValue(dec.pollLast(), value);
                return;
            default:
                hasError = true;
        }
    }

    private void checkPollValue(Integer decValue, int value) {
        if (decValue == null) {
            if (value != -1) {
                hasError = true;
            }
        } else if (decValue != value)
            hasError = true;
    }
}
