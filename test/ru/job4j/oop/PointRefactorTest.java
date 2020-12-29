package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PointRefactorTest {

    @Test
    public void wnehNotEqualsdistance3d() {
        PointRefactor c = new PointRefactor(1, 2, 3);
        PointRefactor d = new PointRefactor(1, 2, 2);
    assertThat(c.distance3d(d), is(1.0));
    }

    @Test
    public void whenEqualsdistance3d() {
        PointRefactor c = new PointRefactor(1, 2, 2);
        PointRefactor d = new PointRefactor(1, 2, 2);
        assertThat(c.distance3d(d), is(0.0));
    }
}