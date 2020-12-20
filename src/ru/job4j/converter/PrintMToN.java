package ru.job4j.converter;

public class PrintMToN {
    public static void out(int n, int m) {
        for (int i = n; i < m; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        PrintMToN.out(8, 12);
    }
}

