package ru.job4j.loop;

public class Loop {
    public static void out(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        return;
    }

    public static void main(String[] args) {
        Loop.out(6);
    }
}
