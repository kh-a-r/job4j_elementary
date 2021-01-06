package ru.job4j.condition;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test
    public void whenA1B3C1D5Then4() {
        Point a = new Point(1, 1);
        Point b = new Point(3, 5);
        double rsl = a.distance(b);
        double expected = 4.47;

    /* int a = 1;
     int b = 3;
     int c = 1;
     int d = 5;
     double out = Point.distance(a, b, c, d);*/
    assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenA0B1C1D1Then1() {
        Point a = new Point(0, 0);
        Point b = new Point(-1, -1);
        double rsl = a.distance(b);
        double expected = 1.41;
        assertEquals(expected, rsl, 0.1);
    }
}