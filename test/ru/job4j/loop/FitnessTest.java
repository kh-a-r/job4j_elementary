package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class FitnessTest {

    @Test
    public void whenIvan90Nic100then1() {
        assertEquals(Fitness.calc(90, 100), 1);
        assertEquals(Fitness.calc(95, 90),  0);
        assertEquals(Fitness.calc(50,  90), 2);
    }
}