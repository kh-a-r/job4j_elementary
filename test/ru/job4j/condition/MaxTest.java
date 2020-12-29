package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int rslt = max.check(1, 2);
        Assert.assertEquals(rslt, 2);
    }

    @Test
    public void whenMax2To1Then() {
        Max max = new Max();
        int rslt = max.check(1, 2, 0);
        Assert.assertEquals(rslt, 2);
    }

    @Test
    public void whenMax2To2Then() {
        Max max = new Max();
        int rslt = max.check(1, 2, 3, -1);
        Assert.assertEquals(rslt, 3);
    }
}