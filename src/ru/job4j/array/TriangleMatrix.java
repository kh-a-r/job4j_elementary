package ru.job4j.array;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] array = new int[count][count];
        int el = 1;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < el; j++) {
                while (i >= j) {
                    array[i][j] = el;
                    el++;
                    break;
                }

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }

    public static void main(String[] args) {
        rows(2);
    }
}
