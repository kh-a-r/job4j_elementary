package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        StringBuilder build = new StringBuilder(s);
        if (s.length() == 0) {
            System.out.println("empty1");
        } else if (s.length() <= 5) {
            System.out.println(s);
        } else {
            for (int i = 1; i < s.length() - 5; i++) {
             build.setCharAt(i, '#');
            }
            System.out.println(build);
        }
       return s;
    }

    public static void main(String[] args) {
        Cryptography.code("");
        Cryptography.code("\"23\"");
        Cryptography.code("\"45563646079999935616\"");
    }
}
