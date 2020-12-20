package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinDiapasonTest {

    @Test
    public void findFirstMinIn() {

            assertThat(
                    MinDiapason.findMinIn(
                            new int[] {-1, 0, 5, 10},
                            1, 3
                    ),
                    is(0)
            );
        }

    @Test
    public void findMiddleMinIn() {

        assertThat(
                MinDiapason.findMinIn(
                        new int[] {-1, 0, 5, 10},
                        0, 2
                ),
                is(-1)
        );
    }

    @Test
    public void findLastMinIn() {

        assertThat(
                MinDiapason.findMinIn(
                        new int[] {1, 10, 5, 1},
                        1, 3
                ),
                is(1)
        );
    }

    }
