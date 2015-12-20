package me.ibukanov.algs;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ParenthesesSequence {

    private List<Character> initial = new LinkedList<>();
    private LinkedList<Character> result = new LinkedList<>();
    private LinkedList<Character> stack = new LinkedList<>();
    private final char[] values;

    public ParenthesesSequence(char[] values) {
        this.values = values;
    }

    public String alg() {
        if (values.length == 0) {
            return "IMPOSSIBLE";
        }
        for (char c : values) {
            initial.add(c);
        }
        forward();
        return result();
    }

    private void forward() {
        ListIterator<Character> it = initial.listIterator();
        while (it.hasNext()) {
            char c = it.next();
            result.addLast(c);
            if (isOpen(c)) {
                handleOpen(c);
            } else {
                handleClose(it, c);
            }
        }
        result.addAll(stack);
    }

    private void handleOpen(char c) {
        stack.addFirst(getOpposite(c));
    }

    private void handleClose(ListIterator<Character> it, char c) {
        if (stack.isEmpty()) {
            result.addFirst(getOpposite(c));
        }
        if (!stack.isEmpty() && stack.getFirst() == c) {
            stack.removeFirst();
            it.remove();
            it.previous();
            it.remove();
        }
    }

    private String result() {
        if (!isPossible(result)) {
            return "IMPOSSIBLE";
        } else {
            StringBuilder r = new StringBuilder();
            result.forEach(r::append);
            return r.toString();
        }
    }

    private static boolean isPossible(Collection<Character> res) {
        LinkedList<Character> stack = new LinkedList<>();
        for (char c: res) {
            switch (c) {
                case '{':
                case '(':
                case '[':
                    stack.push(c);
                    break;
                case '}':
                    if (!checkClose(stack, '{')) {
                        return false;
                    }
                    break;
                case ']':
                    if (!checkClose(stack, '[')) {
                        return false;
                    }
                    break;
                case ')':
                    if (!checkClose(stack, '(')) {
                        return false;
                    }
                    break;
                default: return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean isOpen(char c) {
        switch (c) {
            case '{':
            case '(':
            case '[':
                return true;
            case '}':
            case ']':
            case ')':
            default: return false;
        }
    }

    private static boolean checkClose(LinkedList<Character> stack, char c) {
        if (stack.isEmpty()) {
            return false;
        } else if(stack.getFirst().equals(c)) {
            stack.removeFirst();
        } else if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }

    private static char getOpposite(char c) {
        switch (c) {
            case '{':
                return '}';
            case '(':
                return ')';
            case '[':
                return ']';
            case '}':
                return '{';
            case ']':
                return '[';
            case ')':
                return '(';
            default: return '\0';
        }
    }
}
