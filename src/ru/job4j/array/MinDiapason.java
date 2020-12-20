package ru.job4j.array;

public class MinDiapason {
    public static int findMinIn(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {3, 7, 9, 0, 1};
        System.out.println(MinDiapason.findMinIn(array, 3, 4));
    }
}
