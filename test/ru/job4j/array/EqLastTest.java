package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static ru.job4j.array.EqLast.check;

public class EqLastTest {

    @Test
    public void whenLastElEq() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        assertThat(check(left, right), is(true));
    }

    @Test
    public void whenLastElNotEq() {
        int[] left = {1, 2};
        int[] right = {5, 4, 3};
        assertThat(check(left, right), is(false));
    }
}