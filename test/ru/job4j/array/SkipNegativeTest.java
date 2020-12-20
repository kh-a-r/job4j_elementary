package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SkipNegativeTest {

    @Test
    public void skip() {
        int[][] data = {
                {-1, -2}
        };
        int[][] rsl = SkipNegative.skip(data);
        int[][] expected = {
                {0, 0}
        };
        assertThat(rsl, is(expected));
    }

    @Test
    public void skipTwo() {
        int[][] data = {
                {-1, -2},
                {2, 8}
        };
        int[][] rsl = SkipNegative.skip(data);
        int[][] expected = {
                {0, 0},
                {2, 8}
        };
        assertThat(rsl, is(expected));
    }
}