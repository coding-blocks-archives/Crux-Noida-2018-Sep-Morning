package com.codingblocks;

public class Main {

    public static void main(String[] args) {

//        int[] nums = new int[10];

        int[][] twod = {
                {1, 2, 3, 4},
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34}
        };

        spiral(twod);

//        for (int r = 0; r < twod.length; r++) {
//            if (r%2 == 0){
//                for (int c = 0; c < twod[r].length; c++) {
//                    System.out.println(twod[r][c]);
//                }
//            } else {
//                for (int c = twod[r].length - 1; c > 0; c--) {
//                    System.out.println(twod[r][c]);
//                }
//            }
//        }
//
//
//        for (int c = 0; c < twod[0].length; c++) {
//            if (c % 2 == 0){
//                for (int r = 0; r < twod.length; r++) {
//                    System.out.println(twod[r][c]);
//                }
//            }
//        }
    }

    public static void spiral(int[][] nums){
        int top = 0;
        int bottom = nums.length-1;
        int left = 0;
        int right = nums[0].length - 1;

        while (left <= right && top <= bottom){
            for (int c = left; c <= right ; c++) {
                System.out.println(nums[top][c]);
            }
            top++;

            for (int r = top; r <= bottom ; r++) {
                System.out.println(nums[r][right]);
            }
            right--;

            for (int c = right; c >= left ; c--) {
                System.out.println(nums[bottom][c]);
            }
            bottom--;

            for (int r = bottom; r >= top; r--) {
                System.out.println(nums[r][left]);
            }
            left++;
        }
    }
}
