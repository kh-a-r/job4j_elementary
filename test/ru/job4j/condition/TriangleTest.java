package ru.job4j.condition;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenExist() {
        boolean rslt = Triangle.exist(2, 2, 2);

        Assert.assertTrue(rslt);
    }

    @Test
    public void whenNotExist() {
        boolean rslt = Triangle.exist(10, 2, 3);

        Assert.assertFalse(rslt);
    }
}