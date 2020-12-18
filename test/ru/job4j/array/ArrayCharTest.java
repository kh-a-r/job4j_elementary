package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ArrayCharTest {

    @Test
    public void whenStartsWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean rsl = ArrayChar.startsWith(word, pref);
        assertThat(rsl, is(true));
    }

    @Test
    public void whenStartsWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean rsl = ArrayChar.startsWith(word, pref);
        assertThat(rsl, is(false));
    }
}