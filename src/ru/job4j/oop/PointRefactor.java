package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class PointRefactor {
    private int x;
    private int y;
    private int z;

    public PointRefactor(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public PointRefactor(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public double distance(PointRefactor that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(PointRefactor that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        PointRefactor a = new PointRefactor(0, 0);
        PointRefactor b = new PointRefactor(0, 2);
        PointRefactor c = new PointRefactor(1, 2, 3);
        PointRefactor d = new PointRefactor(1, 2, 2);
        double dist = a.distance(b);
        System.out.println(dist);
        System.out.println(c.distance3d(d));
        //a.info();
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }

}
