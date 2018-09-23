package com.codingblocks;

public class TwoD {
    public static void main(String[] args) {
//        int[][] nums = new int[5][4];
        int[][] nums = {
                {1, 2, 3, 4},
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
        };

        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i].length);
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void vertical(int[][] nums){
        for (int j = 0; j < nums[0].length; j++) {
            if (j % 2 == 0){
                for (int i = 0; i < nums.length; i++) {
                    System.out.println(nums[i][j]);
                }
            } else {
                for (int i = nums.length - 1; i >= 0 ; i--) {
                    System.out.println(nums[i][j]);
                }
            }
        }
    }
}
