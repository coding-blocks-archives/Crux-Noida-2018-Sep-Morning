package com.codingblocks;

public class Reverse {
    public static void main(String[] args) {

        int num = 5;

        int row  = 0;

        int line = 0;

        while (line < 2* num){

            int col = 0;

            while (col < num - row - 1){
                System.out.print("  ");
                col++;
            }

            col = 0;
            int k = 0;

            while (k <= 2 * row){
                System.out.print(row+col+1 + " ");
                k++;

                if (k <= row){
                    col++;
                } else {
                    col--;
                }
            }


            System.out.println();

            line++;

            if (line < num){
                row++;
            } else {
                row--;
            }
        }
    }
}
