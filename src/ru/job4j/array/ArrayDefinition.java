package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surname = new String[100500];
        float[] prices = new float[40];
        System.out.println(ages.length);
        System.out.println(prices.length);
        System.out.println(surname.length);
        String[] names = new String[4];
        names[0] = "Wowa";
        names[1] = "Anna";
        names[2] = "Petr";
        names[3] = "Marina";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);


    }
}