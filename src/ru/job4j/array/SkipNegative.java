package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                if (array[row][cell] < 0) {
                    array[row][cell] = 0;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] array = {
                {-1, 0, 5},
                {4, -1, -3}
        };
        int[][] rsl = SkipNegative.skip(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(rsl[i][j] + " ");
            }
            System.out.println();
        }
    }
}
