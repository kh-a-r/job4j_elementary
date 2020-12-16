package ru.job4j.loop;

public class PrimeNumber {
    public static int count(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
           if (CheckPrimeNumber.check(i)) {
               count++;
           }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(PrimeNumber.count(5));
    }
}
