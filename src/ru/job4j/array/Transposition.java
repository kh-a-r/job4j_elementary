package ru.job4j.array;

public class Transposition {
    public static int[][] convert(int[][] matrix) {
        int[][] transArray = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transArray[j][i] = matrix[i][j];
            }
        }
        return transArray;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1, 2, 3}, {4, 5, 6}};
        int[][] rsl = Transposition.convert(matrix);
        for (int i = 0; i < rsl.length; i++) {
            for (int j = 0; j < rsl[i].length; j++) {
                System.out.print(rsl[i][j] + " ");
            }
            System.out.println();
        }
    }
}
