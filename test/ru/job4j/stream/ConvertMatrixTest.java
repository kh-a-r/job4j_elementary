package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class ConvertMatrixTest {

    @Test
    public void matrixToList() {
        Integer[][] array = new Integer[][] {
                {1, 2, 3},
                {4, 5, 6},
                {6, 7, 8}
        };
        ConvertMatrix convertMatrix = new ConvertMatrix();
        List<Integer> rls = convertMatrix.matrixToList(array);
        assertThat(rls, is(Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8)));
    }
}