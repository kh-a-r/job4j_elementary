package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MortgageTest {

    @Test
    public void when1Year() {
        int rsl = Mortgage.year(1000, 1200, 1);
        assertThat(rsl, is(1));
    }

    @Test
    public void when4Year() {
        int rsl = Mortgage.year(100, 70, 50);
        assertThat(rsl, is(4));
    }
}