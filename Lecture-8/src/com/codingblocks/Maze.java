package com.codingblocks;

public class Maze {

    public static void main(String[] args) {
//        mazePath("", 4, 3);

//        boardPath("", 4);

        boolean[][] maze = new boolean[10][10];


        mazeAllPath("", 0, 0, maze);
    }

    public static int mazeCount(int row, int col){
        if (row == 1 || col == 1){
            return 1;
        }

        return mazeCount(row - 1, col) + mazeCount(row, col - 1);
    }

    public static void mazePath(String path, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(path);
            return;
        }

        if (row > 1) {
            mazePath(path + "V", row - 1, col);
        }

        if (col > 1) {
            mazePath(path + "H", row, col - 1);
        }
    }

    public static void mazePathWithD(String path, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(path);
            return;
        }

        if (row > 1) {
            mazePathWithD(path + "V", row - 1, col);
        }

        if (col > 1) {
            mazePathWithD(path + "H", row, col - 1);
        }

        if (col > 1 && row > 1) {
            mazePathWithD(path + "D", row - 1, col - 1);
        }
    }

    public static int boardCount(int target){
        if (target == 0){
            return 1;
        }

        int count = 0;

        for (int i = 1; i <= 6 && i <= target ; i++) {
            count += boardCount(target - i);
        }

        return count;
    }

    public static int boardPath(String path, int target){
        if (target == 0){
            System.out.println(path);
            return 1;
        }

        int count = 0;

        for (int i = 1; i <= 6 && i <= target ; i++) {
            count += boardPath(path + i, target - i);
        }

        return count;
    }

    public static void mazePathRes(String path, int row, int col, boolean[][] maze){

        if (!maze[row][col]){
            return;
        }

        if (row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(path);
            return;
        }

        if (row < maze.length - 1){
            mazePathRes(path + "V", row + 1, col, maze);
        }

        if (col < maze[0].length - 1){
            mazePathRes(path + "H", row, col + 1, maze);
        }
    }

    public static void mazeAllPath(String path, int row, int col, boolean[][] maze){

        if ( !(row >= 0 && row < maze.length && col >= 0 && col < maze[0].length)){
            return;
        }

        if (maze[row][col]){
            return;
        }

        if (row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(path);
            return;
        }

        maze[row][col] = true;

        mazeAllPath(path + "R", row, col + 1, maze);
        mazeAllPath(path + "L", row, col - 1, maze);
        mazeAllPath(path + "U", row - 1, col, maze);
        mazeAllPath(path + "D", row + 1, col, maze);

        maze[row][col] = false;

    }
}
