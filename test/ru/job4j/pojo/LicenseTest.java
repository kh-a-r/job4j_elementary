package ru.job4j.pojo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LicenseTest {

    @Test
    public void testEqualsOwner() {
        License first = new License();
        first.setOwner("Newman");
        License second = new License();
        second.setOwner("Newman");
        assertThat(first, is(second));
    }
}