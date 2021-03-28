package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String>  map = new HashMap<>();
        map.put("qwe@maol.ru", "Ivanov Ica");
        map.put("qwe12@maol.ru", "Ivanova Ica");
        map.put("qweqw@maol.ru", "Ivano Ica");
        map.put("qwe@mal.ru", "Iv Ica");
               for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
