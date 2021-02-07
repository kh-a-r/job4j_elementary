package ru.job4j.array;

import java.util.Arrays;

public class Item {
    private static String[] f;
    String[] items = {null, "fgh", "fdr", null};

    public String[] findAll() {
        String[] noNull = new String[items.length];
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                noNull[count] = items[i];
                count++;
            }
        }
        return Arrays.copyOf(noNull, count);
    }

    public static void main(String[] args) {
        Item rsl = new Item();
        String[] items = {null, "fgh", "fdr", null};
        String[] noNull = rsl.findAll();

        for (int i = 0; i < noNull.length; i++) {
            System.out.println(noNull[i] +" ");
        }
    }

}

