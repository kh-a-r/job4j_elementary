package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void whenMinLast() {
        int[] data = {3, 5, 0};
        int min = Min.findMin(data);
        assertThat(min, is(0));
    }

    @Test
    public void whenMinMidlle() {
        int[] data = {13, 8, 0, 5, 8};
        int min = Min.findMin(data);
        assertThat(min, is(0));
    }

    @Test
    public void whenMinFirst() {
        int[] data = {0, 5, 3};
        int min = Min.findMin(data);
        assertThat(min, is(0));
    }
}