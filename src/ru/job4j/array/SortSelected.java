package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = MinDiapason.findMinIn(array, 0, array.length - 1);
            int index = FindLoop.indexOfIn(array, min, 0, array.length);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {8, 7, 2, 0, 5};
        int[] rsl = SortSelected.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(rsl[i] + " ");
        }
    }
}
