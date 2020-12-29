package ru.job4j.oop;

import static java.lang.Math.sqrt;

public class Triangle {
    private PointRefactor first;
    private PointRefactor second;
    private PointRefactor third;

    public Triangle(PointRefactor ap, PointRefactor bp, PointRefactor cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double period(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return p;

    }

    public boolean exist(double ab, double bc, double ac) {
        return  ab + bc > ac && bc + ac > ab && ac + ab > bc;
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
        return rsl;
    }

    public static void main(String[] args) {
        PointRefactor a = new PointRefactor(0, 0);
        PointRefactor b = new PointRefactor(4, 0);
        PointRefactor c = new PointRefactor(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        System.out.println(triangle.area());
    }
}