package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void whenFactorialForFiveThenOneHundreedTwenty() {
    int rsl = Factorial.calc(5);
    int expected = 120;
        //Assert.assertTrue(true);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenFactorialForZeroThenOne() {
        int rsl = Factorial.calc(0);
        int expected = 1;
        Assert.assertEquals(expected, rsl);
    }
}