package ru.job4j.array;

public class Square {

    public static int[] calculate(int bound) {
        int[] squareArray = new int[bound];
        for (int i = 0; i < bound; i++) {
            squareArray[i] = i * i;
        }
        return squareArray;
    }

    public static void main(String[] args) {

    int[] array = Square.calculate(5);
        for (int index : array) {
            System.out.println(index);
        }
    }
}
