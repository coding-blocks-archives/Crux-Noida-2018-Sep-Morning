package com.codingblocks;

import java.util.Scanner;

public class Queens {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        boolean[][] board = new boolean[n][n];

        nqueens(board, 0);

    }

    public static void nqueens(boolean[][] board, int row){
        if (row == board.length){
            display(board);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)){
                board[row][col] = true;

                nqueens(board, row + 1);

                board[row][col] = false;
            }
        }
    }

    public static void display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j]){
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        // check vertically up
        for (int r = 0; r < row; r++) {
            if (board[r][col]){
                return false;
            }
        }

        // check diag left

        int steps_left = Math.min(row, col);

        for (int i = 1; i <= steps_left; i++) {
            if (board[row - i][col - i]){
                return false;
            }
        }

        // check diag right

        int steps_right = Math.min(row, board.length - 1 - col);

        for (int i = 1; i <= steps_right ; i++) {
            if (board[row - i][col + i]){
                return false;
            }
        }

        return true;

    }
}
