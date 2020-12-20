package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int summa = 0;
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                summa = summa + array[row][cell];
            }
        }
        return summa;
    }

    public static void main(String[] args) {
        int[][] array = {
                {4, 2, 3},
                {7, 1, 0}
        };
        System.out.println(MatrixSum.sum(array));
    }
}
