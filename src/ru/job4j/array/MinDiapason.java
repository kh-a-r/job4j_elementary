package ru.job4j.array;

public class MinDiapason {
    public static int findMinIn(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {3, 7, 9, 10, 1};
        System.out.println(MinDiapason.findMinIn(array, 0, 4));
    }
}
