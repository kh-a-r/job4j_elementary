package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double bc, double ac) {
        return ab + bc > ac && ab + ac > bc && ac + bc > ab;
    }

    public static void main(String[] args) {
        System.out.println(exist(2, 2, 2));
        System.out.println(exist(4, 4, 9));
    }
}
