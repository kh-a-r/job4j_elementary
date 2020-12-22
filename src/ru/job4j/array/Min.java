package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
     int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
              min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
       // int[] array = {10, 0, 1, 11, 10};
       int[] array = {3, 7, 9, 10, 11};
        System.out.println(Min.findMin(array));
    }
}
