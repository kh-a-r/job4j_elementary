package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class NonUniqueString {
    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Boolean> mapList = new HashMap<>();
        for (String element : strings
        ) {
            if (!mapList.containsKey(element)) {
                mapList.put(element, Boolean.FALSE);
            } else {
                mapList.put(element, Boolean.TRUE);
            }
            }
        return mapList;
    }
}
