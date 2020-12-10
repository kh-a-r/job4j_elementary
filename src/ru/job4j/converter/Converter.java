package ru.job4j.converter;

public class Converter {
    public static int rublesToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static int rublesToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static void main(String[] args) {
        int in = 120;
        int expected = 2;
        int out = Converter.rublesToDollar(120);
        boolean passed = expected == out;
       /* int euro = Converter.rublesToEuro(140);
        int dollar = Converter.rublesToDollar(120);
        System.out.println(euro);
        System.out.println(dollar);*/
        System.out.println(passed);
    }
}
