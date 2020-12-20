package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixSumTest {

    @Test
    public void whenSingle() {
        int[][] array = {
                {10}
        };
        assertThat(MatrixSum.sum(array), is(10));
    }

    @Test
    public void whenTwo() {
        int[][] array = {
                {10, 2},
                {2, 1}
        };
        assertThat(MatrixSum.sum(array), is(15));
    }

    @Test
    public void whenThree() {
        int[][] array = {
                {10, 2, 3},
                {1, 2, 3},
                {0, 0, 1}
        };
        assertThat(MatrixSum.sum(array), is(22));
    }

}