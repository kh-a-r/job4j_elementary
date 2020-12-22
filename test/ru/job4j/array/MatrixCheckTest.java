package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontalString() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotHasMonoHorizontalString() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'a', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(false));
    }

    @Test
    public void whenNotHasMonoVerticalString() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'a', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoVertical(input, 1);
        assertThat(result, is(false));
    }

    @Test
    public void whenHasMonoVerticalString() {
        char[][] input = {
                {'X', ' ', ' '},
                {'X', 'a', 'X'},
                {'X', ' ', ' '},
        };
        boolean result = MatrixCheck.monoVertical(input, 0);
        assertThat(result, is(true));
    }

    @Test
    public void whenDiagonal() {
        char[][] input = {
                {'X', ' ', ' '},
                {'X', 'a', 'X'},
                {'X', ' ', 'b'},
        };
        char[] rsl = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', 'a', 'b'};
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenHasVMonoTrueThenTrue() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoTrueThenTrue() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotHasMonoTrueThenFalse() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', ' ', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', 'X'},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(false));
    }
}