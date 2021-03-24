package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String dublicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text  = dublicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String element : origin) {
            check.add(element);
        }
        for (String word : text) {
            if (!check.contains(word)) {
                rsl = false;
            }
        }
        return rsl;
    }
}
