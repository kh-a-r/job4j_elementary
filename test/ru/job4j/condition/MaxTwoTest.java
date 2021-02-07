package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MaxTwoTest {

    @Test
    public void whenMaxSecond() {
        assertThat(MaxTwo.max(1, 2), is(2));
    }

    @Test
    public void whenMaxFirst() {
        assertThat(MaxTwo.max(3, 2), is(3));
    }

    @Test
    public void whenEquals() {
        assertThat(MaxTwo.max(4, 4), is(4));
    }

    @Test
    public void whenNegativeNumber() {
        assertThat(MaxTwo.max(-2, 1), is(1));
    }
}