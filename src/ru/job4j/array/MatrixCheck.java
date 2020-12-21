package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
            for (int cell = 0; cell < board[row].length; cell++) {
                if (board[row][cell] != 'X') {
                    result = false;
                    break;
                }
            }
        return result;
    }

    public static void main(String[] args) {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        System.out.println(result);
    }
}
