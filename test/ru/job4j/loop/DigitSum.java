package ru.job4j.loop;

public class DigitSum {
    public static int sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(DigitSum.sum(12));
    }
}
