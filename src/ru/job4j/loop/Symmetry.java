package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int n) {
        String number = String.valueOf(n);
        boolean equal = true;
        for (int i = 0; i < number.length() / 2; i++) {
            if (number.charAt(i) != number.charAt(number.length() - 1 - i)) {
                equal = false;
            }
        }
        return equal;
    }

    public static void main(String[] args) {

        System.out.println(check(12344321));
    }
}
