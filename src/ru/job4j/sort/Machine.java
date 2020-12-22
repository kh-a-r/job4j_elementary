package ru.job4j.sort;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int change1 = money - price;
        for (int i = 0; i < coins.length; i++) {
                while (coins[i] <= change1) {
                   change1 = change1 - coins[i];
                rsl[size] = coins[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        int[] rsl = change(100, 89);
        for (int i = 0; i < rsl.length; i++) {
            System.out.print(rsl[i] + " ");
        }
    }
}

