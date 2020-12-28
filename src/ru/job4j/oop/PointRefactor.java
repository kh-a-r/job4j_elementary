package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class PointRefactor {
    private int x;
    private int y;

    public PointRefactor(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(PointRefactor that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        PointRefactor a = new PointRefactor(0, 0);
        PointRefactor b = new PointRefactor(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }

}
