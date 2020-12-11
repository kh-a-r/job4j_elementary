package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
    int rslt = Max.max(1, 2);
        Assert.assertEquals(rslt, 2);
    }

    @Test
    public void whenMax2To1Then() {
        int rslt = Max.max(2, 1);
        Assert.assertEquals(rslt, 2);
    }

    @Test
    public void whenMax2To2Then() {
        int rslt = Max.max(2, 2);
        Assert.assertEquals(rslt, 2);
    }
}