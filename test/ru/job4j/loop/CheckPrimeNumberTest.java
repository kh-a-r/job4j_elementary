package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void when14() {
        boolean rsl = CheckPrimeNumber.check(14);

        assertThat(rsl, is(false));
    }

    @Test
    public void when11() {
        boolean rsl = CheckPrimeNumber.check(11);

        assertThat(rsl, is(true));
    }
}