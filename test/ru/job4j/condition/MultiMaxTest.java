package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenMaxFirst() {
        int rsl = MultiMax.max(6,3,4);
        Assert.assertTrue(true);
    }

    @Test
    public void whenMaxSecond() {
        int rsl = MultiMax.max(5,8,4);
        Assert.assertTrue(true);
    }

    @Test
    public void whenMaxThird() {
        int rsl = MultiMax.max(2,7,9);
        Assert.assertTrue(true);
    }

    @Test
    public void whenMaxAll() {
        int rsl = MultiMax.max(4,4,4);
        Assert.assertTrue(true);
    }

}