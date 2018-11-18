package com.codingblocks;


import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Maze {
    public static void main(String[] args) {

//        Map<String, BigInteger> map = new HashMap<>();

        System.out.println(mazeDP(4, 4));
    }

    public static int maze(int row, int col){
        if (row == 1 || col == 1){
            return 1;
        }
        return maze(row-1, col) + maze(row, col - 1);
    }

    public static BigInteger mazeDP(int row, int col){
        BigInteger[][] mem = new BigInteger[row+1][col+1];
        return mazeDP(row, col, mem);
    }
    
    private static BigInteger mazeDPItr(int row, int col, BigInteger[][] mem){
        for (int r = 1; r <= row; r++) {
            for (int c = 1; c <= col ; c++) {
                if (r == 1 || c == 1){
                    mem[r][c] = BigInteger.ONE;
                } else {
                    mem[r][c] = mem[r-1][c].add(mem[r][c-1]);
                }
            }
        }

        return mem[row][col];
    }

    private static BigInteger mazeDP(int row, int col, BigInteger[][] mem){
        if (row == 1 || col == 1){
            return BigInteger.ONE;
        }

        if (mem[row][col] != null){
            return mem[row][col];
        }

        mem[row][col] = mazeDP(row - 1, col, mem).add(mazeDP(row, col - 1, mem));

        return mem[row][col];
    }


//
//    public static BigInteger mazeDP(int row, int col, Map<String, BigInteger> map){
//        if (row == 1 || col == 1){
//            return BigInteger.ONE;
//        }
//
//        if (map.containsKey(row + "-" + col)){
//            return map.get(row + "-" + col);
//        }
//
//        BigInteger result = mazeDP(row-1, col, map).add(mazeDP(row, col - 1, map));
//
//        map.put(row + "-" + col, result);
//
//        return result;
//    }
}
