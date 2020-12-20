package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void whenTruethenTrue() {
        boolean[] data = {true, true, true};
        boolean rsl = Check.mono(data);
        assertThat(rsl, is(true));
    }

    @Test
    public void whenTrueFalsethenFalse() {
        boolean[] data = {true, false, true};
        boolean rsl = Check.mono(data);
        assertThat(rsl, is(false));
    }

    @Test
    public void whenFalsethenTrue() {
        boolean[] data = {false, false, false};
        boolean rsl = Check.mono(data);
        assertThat(rsl, is(true));
    }
}