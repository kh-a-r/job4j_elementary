package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void when5() {
        int rsl = PrimeNumber.count(5);
        assertThat(rsl, is(3));
    }

    @Test
    public void when11() {
        int rsl = PrimeNumber.count(11);
        assertThat(rsl, is(5));
    }

    @Test
    public void when2() {
        int rsl = PrimeNumber.count(2);
        assertThat(rsl, is(1));
    }
}