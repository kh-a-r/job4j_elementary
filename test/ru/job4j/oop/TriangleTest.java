package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import ru.job4j.oop.PointRefactor;

public class TriangleTest {

    @Test
    public void whenAreaExists() {
        PointRefactor a = new PointRefactor(0, 0);
        PointRefactor b = new PointRefactor(4, 0);
        PointRefactor c = new PointRefactor(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));
    }

    @Test
    public void whenAreaIs0() {
        PointRefactor a = new PointRefactor(0, 0);
        PointRefactor b = new PointRefactor(0, 0);
        PointRefactor c = new PointRefactor(0, 0);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(0, 0.001));
    }

    @Test
    public void whenAreaNotExists() {
        PointRefactor a = new PointRefactor(1, 1);
        PointRefactor b = new PointRefactor(0, 1);
        PointRefactor c = new PointRefactor(3, 1);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = 0;
        assertThat(rsl, is(expected));
    }

}