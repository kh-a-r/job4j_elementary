package ru.job4j.array;

public class CheckSquareArray {
    public static boolean checkArray(int[][] array) {
        boolean rsl = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array.length != array[i].length) {
                    rsl = false;
                }
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[][] in = new int[][]{{4, 5, 6}, {2, 3, 0}, {1, 7, 8}};
     //   int[][] in = new int[][]{{4, 5, 6}, {2, 3}, {1}};
        System.out.println(checkArray(in));
    }
}
