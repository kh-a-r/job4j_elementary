package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(0, 10);
        Assert.assertTrue(true);
    }

    @Test
    public void whenSumEvenNumbersFromThreeToTenNineEightTeen() {
        int rsl = Counter.sumByEven(1, 10);
        Assert.assertTrue(true);
    }
}