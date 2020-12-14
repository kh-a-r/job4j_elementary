package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        rsl = Math.abs(x2 - x1) == Math.abs(y2 - y1) ? Math.abs(x2 - x1) : rsl;
        return rsl;
        // return Math.abs(x2 - x1) == Math.abs(y2 - y1) ? Math.abs(x2 - x1) : 0; можно сразу так
    }

    public static void main(String[] args) {
        System.out.println(ChessBoard.way(4, 4, 2, 5));
    }
}