package ru.job4j.array;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] array = new int[n];
        array[0] = a;
        array[1] = b;
        int sum = a + b;
        for (int i = 2; i < array.length; i++) {
            array[i] = sum;
            sum = array[i] + sum;
        }
        return array;
    }

    public static void main(String[] args) {
      int[] rsl = SummingPrevious.calculate(2, 4, 5);
        for (int i = 0; i < rsl.length; i++) {
            System.out.println(rsl[i] + " ");
        }
    }
}
