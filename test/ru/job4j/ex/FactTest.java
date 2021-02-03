package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactTest {

    @Test
    public void whenFact3Calc() {
        int rsl = Fact.calc(3);
        assertThat(rsl, is(6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenFactMinus3Calc() {
        int rsl = Fact.calc(-3);
    }
}