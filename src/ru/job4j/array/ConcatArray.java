package ru.job4j.array;

public class ConcatArray {
    public static int combineSize(int[] a, int[] b) {
        return a.length + b.length;
    }

    public static void main(String[] args) {
        int[] left = new int[]{1, 3};
        int[] right = new int[]{2, 4};
        int len = ConcatArray.combineSize(left, right);
        System.out.print(len);
    }
}
