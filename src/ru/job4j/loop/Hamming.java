package ru.job4j.loop;

public class Hamming {
    public static int checkStrings(String left, String right) {
        int count = 0;
        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) != right.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Hamming.checkStrings("2173896", "2233796"));
    }
}
