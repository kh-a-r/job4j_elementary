package ru.job4j.oop;

import static java.lang.Math.sqrt;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double period(double a, double b, double c) {
        double p = (a + b + c) / 2;
        System.out.println(p);
        return p;

    }

    public boolean exist(double ab, double bc, double ac) {
        boolean triangleExist = false;
        if (ab + bc > ac && bc + ac > ab && ac + ab > bc) {
            triangleExist = true;
        }
        System.out.println(triangleExist);
            return  false;
    }

    public double area() {
        double rsl = 0;
        double ab = first.distance(second);
        double bc = second.distance(third);
        double ac = third.distance(first);
        double p = period(ab, bc, ac);
        if (this.exist(ab, bc, ac)) {               // вот тут не понятно.
            rsl = sqrt(p * (p - ab) * (p - bc) * (p - ac));
         }
        System.out.println(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);

        System.out.println(triangle.area());

    }
}