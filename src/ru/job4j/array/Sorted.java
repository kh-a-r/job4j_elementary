package ru.job4j.array;

    public class Sorted {
        public static boolean isSorted(int[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    return false;
            }

        }
            return true;
    }

        public static void main(String[] args) {
            System.out.println(
                    Sorted.isSorted(new int[] {1, 2, 3})
            );
        }
}
