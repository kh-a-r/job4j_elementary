package ru.job4j.array;

public class ArrayIndex {

    public static int getFirstElement(int[] array) {
        return array[0];

    }

    public static int getLastElement(int[] array) {
        return array[array.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(getFirstElement(new int[] {1, 2, 3}));
        System.out.println(getLastElement(new int[] {1, 2, 3}));

    }
}
