package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = MinDiapason.findMinIn(array, i, array.length - 1); //search min element
            int index = FindLoop.indexOfIn(array, min, i, array.length); // search index of min element
            SwitchArray.swap(array, index, i);
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = {2, 2, 2, 1, 0};
        int[] rsl = SortSelected.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(rsl[i] + " ");
        }
    }
}
