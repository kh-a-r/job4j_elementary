package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas4Then2() {
        int[] input = {0, 2, 4, 5};
        int rsl = FindLoop.indexOf(input, 4);
        int expect = 2;
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenArrayHas9ThenMinus1() {
        int[] input = {0, 2, 4, 5};
        int rsl = FindLoop.indexOf(input, 9);
        int expect = -1;
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenFind4In2To5() {
        int[] input = {0, 2, 4, 5};
        int rsl = FindLoop.indexOfIn(input, 4, 1, 3);
        int expect = 2;
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenNotFind4In0To2() {
        int[] input = {0, 2, 4, 5};
        int rsl = FindLoop.indexOfIn(input, 4, 0, 1);
        int expect = -1;
        assertThat(rsl, is(expect));
    }
}
