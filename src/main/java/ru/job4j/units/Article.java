package ru.job4j.units;

import java.util.HashSet;
import java.util.Set;

public class Article {
    public static boolean generateBy(String origin, String line) {
        Set<String> check = new HashSet<>();
        String[] originText = origin.split("[ ,!.:;]");
        for (String word : originText
        ) {
            check.add(word);
        }
        String[] newText = line.split("[ ,!.:;]");
        for (String word : newText
        ) {
            if (!check.contains(word)) {
                return false;
            }
        }
        return true;
    }
}


