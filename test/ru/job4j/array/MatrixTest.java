package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void when2On2() {
            int[][] table = Matrix.multiple(2);
            int[][] expect = {
                    {1, 2},
                    {2, 4}
            };
            assertThat(table, is(expect));
        }
    }
