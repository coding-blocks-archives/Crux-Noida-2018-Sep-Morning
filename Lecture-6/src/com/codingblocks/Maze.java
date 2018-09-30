package com.codingblocks;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(toInteger("1234", 0));
        subseq("", "abc");
    }

    public static int count(int row, int col){
        if (row == 1 || col == 1){
            return 1;
        }

        return count(row-1, col) + count(row, col-1);
    }

    public static int toInteger(String number, int result){
        if (number.isEmpty()){
            return result;
        }

        int digit = number.charAt(0) - '0';

        return toInteger(number.substring(1), result * 10 + digit);
    }

    public static void subseq(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        subseq(processed + unprocessed.charAt(0), unprocessed.substring(1));
        subseq(processed, unprocessed.substring(1));
    }
}
