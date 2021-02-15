package ru.job4j.ex;

public class Find {
    public static String get(String[] data, int index) {
        return data[index];
    }

    public static void main(String[] args) {
        String[] data = {"one", "two", "three"};
        String rsl = Find.get(data, -1);
        System.out.println(rsl);
    }
}
