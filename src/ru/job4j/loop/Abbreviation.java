package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String line) {
        StringBuilder s = new StringBuilder();
        //   String line1 = "";
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) >= 'A' && line.charAt(i) <= 'Z') {
                //    System.out.print(line.charAt(i));
                //System.out.println(s.append(line.charAt(i)));
                s = s.append(line.charAt(i));
                //  line1 = s.toString();
                //   System.out.println(s);
            }
            // System.out.println(s);
        }
        // System.out.println(s);
        return s.toString();
    }

    public static void main(String[] args) {
        collect("North Atlantic Treaty Organization");
    }
}