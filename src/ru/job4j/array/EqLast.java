package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = false;
        if (left[left.length - 1] == right[right.length - 1]) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] left = {1, 2, 3, 4, 5, 0};
        int[] right = {1, 5, 0};
        boolean rslt = EqLast.check(left, right);
        System.out.println(rslt);
    }
}
