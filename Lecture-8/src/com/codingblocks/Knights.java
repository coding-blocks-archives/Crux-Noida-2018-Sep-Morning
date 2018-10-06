package com.codingblocks;

import java.util.Scanner;

public class Knights {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        boolean[][] board = new boolean[n][n];

        int c = nKnightCount(board, 0, 0);

        System.out.println(c);
    }

    public static void nKnight(boolean[][] board, int row, int col, int knights){
        if (knights == 0){
            Queens.display(board);
            return;
        }

        if (col == board.length){
            nKnight(board, row+1, 0, knights);
            return;
        }

        if (row == board.length){
            return;
        }

        // case of skipping

        nKnight(board, row, col + 1, knights);

        // case of putting

        if (isSafe(board, row, col)){
            board[row][col] = true;
            nKnight(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }
    }

    public static int nKnightCount(boolean[][] board, int row, int col){

        if (col == board.length){
            return nKnightCount(board, row+1, 0);
        }

        if (row == board.length){
            return 0;
        }

        // case of skipping

        int skip = nKnightCount(board, row, col + 1);

        // case of putting

        int place = 0;

        if (isSafe(board, row, col)){
            board[row][col] = true;
            place = 1 + nKnightCount(board, row, col + 1);
            board[row][col] = false;
        }

        return Math.max(place, skip);
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        if (isValid(board, row - 1, col - 2)){
            if (board[row-1][col-2]){
                return false;
            }
        }

        if (isValid(board, row - 2, col - 1)){
            if (board[row-2][col-1]){
                return false;
            }
        }

        if (isValid(board, row - 1, col + 2)){
            if (board[row-1][col+2]){
                return false;
            }
        }

        if (isValid(board, row - 2, col + 1)){
            if (board[row-2][col+1]){
                return false;
            }
        }

        return true;
    }

    public static boolean isValid(boolean[][] board, int row, int col){
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }
}
