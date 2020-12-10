package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenA1B3C1D5Then4() {
        int a = 1;
        int b = 3;
        int c = 1;
        int d = 5;
        double expected = 4.47;
        double out = Point.distance(a, b, c, d);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenA2B3C4D5Then1() {
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 5;
        double expected = 1.41;
        double out = Point.distance(a, b, c, d);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenA11B33C11D55Then49() {
        int a = 11;
        int b = 33;
        int c = 11;
        int d = 55;
        double expected = 49.19;
        double out = Point.distance(a, b, c, d);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenA0B1C1D1Then1() {
        int a = 0;
        int b = -1;
        int c = 0;
        int d = -1;
        double expected = 1.41;
        double out = Point.distance(a, b, c, d);
        Assert.assertEquals(expected, out, 0.1);
    }
}