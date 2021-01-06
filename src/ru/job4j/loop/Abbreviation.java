package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String line) {

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) >= 'A' && line.charAt(i) <= 'Z') {
                s = s.append(line.charAt(i));
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(Abbreviation.collect("North Atlantic Treaty Organization"));
    }
}