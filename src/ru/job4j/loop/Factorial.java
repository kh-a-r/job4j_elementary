package ru.job4j.loop;

public class Factorial {
    public static int calc(int digital) {
        int result = 1;
        for (int i = digital; i > 0; i--) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Factorial.calc(6));
    }
}
