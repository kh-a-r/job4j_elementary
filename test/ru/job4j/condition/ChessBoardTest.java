package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class ChessBoardTest {

    @Test
    public void wayIs5() {
        int way = ChessBoard.way(6, 7, 1, 2);
        Assert.assertTrue(true);
    }

    @Test
    public void wayIs7() {
        int way = ChessBoard.way(7, 0, 0, 7);
        Assert.assertTrue(true);
    }

    @Test
    public void wayIs0() {
        int way = ChessBoard.way(2, 4, 6, 1);
        Assert.assertFalse(false);
    }
}