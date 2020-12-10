package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.converter.Fit;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        int in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman160Then57() {
        int in = 160;
        double expected = 57.50;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}
