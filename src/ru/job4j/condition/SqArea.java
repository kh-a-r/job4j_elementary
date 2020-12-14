package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double side1 = p / (2 * (k + 1));
        double side2 = side1 * k;
        double rslt =  side1 + side2;
        return rslt;
    }

    public static void main(String[] args) {
    System.out.println(square(23, 3));
    }
}
