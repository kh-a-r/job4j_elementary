package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left > right;
        int rslt = condition ? left : right;
        return rslt;
    }

    public static void main(String[] args) {
        System.out.println(Max.max(7, 3));
    }
}
