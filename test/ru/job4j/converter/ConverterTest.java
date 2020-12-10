package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert180rublesThen3Dollar() {
    int in = 180;
    int expected = 3;
    int out = Converter.rublesToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert140rubles2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rublesToEuro(in);
        Assert.assertEquals(expected, out);
    }
}