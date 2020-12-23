package ru.job4j.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        // return n - n / d * d;
        if (n == 0) {
            return 0;
        } else {
            while (n >= d) {
                n = n - d;
            }
            return n;
        }
    }

    public static void main(String[] args) {
        System.out.println(mod(23, 7));
    }
}
