package ru.job4j.units;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        if (left.length() != right.length()) {
            return false;
        }
        return sameMap(left).equals(sameMap(right));
    }

    public static Map<Character, Integer> sameMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toLowerCase().toCharArray()) {
            Integer count = 1;
            if (map.get(c) == null) {
                map.put(c, count);
            } else {
                map.put(c, count + 1);
            }
        }
        return map;
    }
}


