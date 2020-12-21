package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <  size; j++) {
               array[i][j] = (i + 1) * (j + 1);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int size = 9;
        int[][] rsl = Matrix.multiple(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(rsl[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
/* public static void main(String[] args) {
    int size = 9;
    int[][] rsl = Matrix.multiple(size);
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            if (rsl[i][j] >= 10) {
                System.out.print(rsl[i][j] + " ");
            } else {
                System.out.print(rsl[i][j] + "  ");
            }
        }
        System.out.println();
    }
}*/