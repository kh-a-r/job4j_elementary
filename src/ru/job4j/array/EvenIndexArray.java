package ru.job4j.array;

public class EvenIndexArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int a = 0; a < array.length; a++) {
            if (a % 2 == 0) {
                System.out.println(array[a]);
            }
        }
    }
}
