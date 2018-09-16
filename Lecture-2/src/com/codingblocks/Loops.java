package com.codingblocks;

public class Loops {

    public static void main(String[] args) {

//        int count = 10;
//
//        while (count > 0){
//            System.out.println("Coding Blocks is great");
//            count--;
//        }

        // code for triangle
        /*
        int num = 5;

        int row  = 0;

        while (row++ < num){

            int col = 0;

            while (col++ < row){
                System.out.print("* ");
            }

            System.out.println();
        }

*/


/*
        int num = 5;

        int row  = 0;

        while (row < num){

            int col = 0;

            while (col <= row){
                if (col == 0 || col == row){
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
                col++;
            }

            System.out.println();
            row++;
        }
*/


//        int count = 1;
//
//        int num = 5;
//
//        int row  = 0;
//
//        while (row < num){
//
//            int col = 0;
//
//            while (col <= row){
//
//                System.out.print(count++ + " ");
//                col++;
//            }
//
//            System.out.println();
//            row++;
//        }



        int num = 5;

        int line = 0;

        int row  = 0;

        while (line < 2 * num){

            int col = 0;

            while (col <= row){
                System.out.print("* ");
                col++;
            }

            line++;

            if (line < num){
                row++;
            } else {
                row--;
            }

            System.out.println();
        }


    }

}
