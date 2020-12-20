package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] array = {
                {1},
                {3, 5},
                {6, 4, 4},
                {3, 5, 9, 0}
        };
        for (int i = 0; i < array.length; i++) {
                System.out.println(array[i].length);
            }
        }
    }

