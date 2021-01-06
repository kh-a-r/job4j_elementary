package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        String  rsl = "";
        StringBuilder build = new StringBuilder(s);
        if (s.length() == 0) {
           rsl = "empty";
        } else if (s.length() <= 5) {
            rsl = s;
        } else {
            for (int i = 0; i < s.length() - 4; i++) {
            build.setCharAt(i, '#'); // не могу перевести в String
            }
        }
       return rsl;
    }

    public static void main(String[] args) {
        System.out.println(Cryptography.code(""));
    }
}

//   Cryptography.code("45563646079999935616");