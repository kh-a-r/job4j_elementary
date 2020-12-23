package ru.job4j.array;

public class Defragment {
    public static String[] swap(String[] array, int from, int to) {
        for (int index = 0; index < array.length; index++) {
            String temp = array[from];
            array[from] = array[to];
            array[to] = temp;
        }
        return array;
    }

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int j = index + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        swap(array, index, j);
                       break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
      //String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
       compress(input);
    }
}


