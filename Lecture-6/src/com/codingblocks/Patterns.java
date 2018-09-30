package com.codingblocks;

import java.util.Arrays;

public class Patterns {
    public static void main(String[] args) {
//        upTriangle(6, 0);
        int[] nums = {1, 5, 3, 2};

        bubble(nums.length - 1, 0, nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void upTriangle(int row, int col){
        if (row == 0){
            return;
        }

        if (row == col){
            System.out.println();
            upTriangle(row - 1, 0);
            return;
        }

        System.out.print("* ");
        upTriangle(row, col + 1);
    }

    public static void downTriangle(int row, int col){
        if (row == 0){
            return;
        }

        if (row == col){
            downTriangle(row - 1, 0);
            System.out.println();
            return;
        }

        downTriangle(row, col + 1);
        System.out.print("* ");
    }


    public static void bubble(int row, int col, int[] nums){
        if (row == 0){
            return;
        }

        if (row == col){
            bubble(row - 1, 0, nums);
            return;
        }

        if (nums[col] > nums[col+1]){
            int t = nums[col];
            nums[col] = nums[col+1];
            nums[col+1] = t;
        }

        bubble(row, col + 1, nums);
    }
}
