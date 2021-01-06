package ru.job4j.array;

public class SwapRows {

    public static void swap(int[][] data, int src, int dst) {

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i == src) {
                    int temp = data[dst][j];
                    data[dst][j] = data[src][j];
                    data[src][j] = temp;
                }
            }
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        SwapRows.swap(data, 2, 0);
    }
}

