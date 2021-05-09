package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NonUniqueStringTest {

    @Test
    public void whenEq() {
        assertThat(NonUniqueString.eq("Hellol", "Hlloel"), is(true));
    }

    @Test
    public void whenNotEq() {
        assertThat(NonUniqueString.eq("Hello", "Halle"), is(false));
    }

    @Test
    public void whenNotMultiEq() {
        assertThat(NonUniqueString.eq("heloo", "hello"), is(false));
    }
}