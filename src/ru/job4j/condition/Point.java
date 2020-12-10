package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int x2, int y1, int y2) {
        double rslt = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rslt;
    }

    public static void main(String[] args) {
        double result = Point.distance(11, 33, 11, 55);
        System.out.println(result);
    }
}
