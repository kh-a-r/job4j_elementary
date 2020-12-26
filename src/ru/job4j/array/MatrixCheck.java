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

    public static boolean monoVertical(char[][] board, int cell) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][cell] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int row = 0; row < board.length; row++) {
            result[row] = board[row][row];
        }
        return result;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        char[] diagonal = MatrixCheck.extractDiagonal(board);
        for (int i = 0; i < board.length; i++) {
            if (diagonal[i] == 'X') {
                if (monoHorizontal(board, i) || monoVertical(board, i)) {
                    result = true;
                break;
            }
        }

        }
        return result;
    }

    public static void main(String[] args) {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', 'X'},
        };
      /* boolean resultHorizontal = MatrixCheck.monoHorizontal(input, 1);
        System.out.println(resultHorizontal);

        boolean resultVertical = MatrixCheck.monoVertical(input, 0);
        System.out.println(resultVertical);

        char[] rslDiagonal = MatrixCheck.extractDiagonal(input);
        System.out.print("Одномерный массив из элементов диагонали двумерного массива:");
        for (int i = 0; i < input.length; i++) {
            System.out.print(rslDiagonal[i] + " ");
        }*/

        System.out.println(MatrixCheck.isWin(input));
    }
}
