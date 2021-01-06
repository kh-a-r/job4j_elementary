package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];

                    if (left[left.length - 1] <= right[0]) {
                        for (int i = 0; i < left.length; i++) {
                            rsl[i] = left[i];
                            }
                            for (int j = 0; j < right.length; j++) {
                                rsl[j + left.length] = right[j];
                            }
                        } else {
                        if (left[0] >= right[0]) {
                            rsl[0] = right[0];
                        }
                    }
            return rsl;
            }

    public static void main(String[] args) {
        int[] left = new int[]{1, 3};
        int[] right = new int[]{2, 4};
        int[] rsl = Merge.merge(left, right);
        for (int i = 0; i < rsl.length; i++) {
            System.out.print(rsl[i]);
        }
    }
}