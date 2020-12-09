package ru.job4j.converter;

public class Converter {
    public static int rublesToDollar(int value){
        int rsl = value / 60;
        return rsl;
    }
    public static int rublesToEuro(int value){
        int rsl = value / 70;
        return rsl;
    }
    public static void main (String[] args){
        int euro = Converter.rublesToEuro(140);
        int dollar = Converter.rublesToDollar(120);
        System.out.println(euro);
        System.out.println(dollar);
    }
}
