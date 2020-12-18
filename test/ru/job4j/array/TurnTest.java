package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenEvenElementsArray() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {4, 3, 2, 1};
        int[] rsl = Turn.back(input);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenNotEvenElementsArray() {
        int[] input = {1, 2, 3, 4, 0};
        int[] expected = {0, 4, 3, 2, 1};
        int[] rsl = Turn.back(input);
        assertThat(rsl, is(expected));
    }
}