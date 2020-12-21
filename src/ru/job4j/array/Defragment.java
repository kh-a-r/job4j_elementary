/*package ru.job4j.array;

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
                int from = index;
                break;
            }

        for (int j = 0; j < array.length; j++) {
            if (array[j] != null && j > from) {
                        swap(array, from, j);
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
    //   String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
      //  String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}

*/