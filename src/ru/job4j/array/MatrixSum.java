package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                summa = summa + array[i][j];
            }
        }
        return summa;
    }

    public static void main(String[] args) {
        int[][] array = {
                {4, 2, 3},
                {7, 1, 5},
                {3, 5, 6}
        };
        System.out.println(MatrixSum.sum(array));
    }
}
