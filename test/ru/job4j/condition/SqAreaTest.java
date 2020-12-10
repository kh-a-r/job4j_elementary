package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP12K2Then8() {
        int p = 12;
        int k = 2;
        double expected = 8;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenP23K3Then12() {
        int p = 23;
        int k = 3;
        double expected = 12;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.001);
    }
}