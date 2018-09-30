package com.codingblocks;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
    }

    public static boolean isSorted(int[] nums, int index){
        if (index == nums.length - 1){
            return true;
        }

        return nums[index]<= nums[index+1] && isSorted(nums, index+1);
    }

    public static boolean isSortedBad(int[] nums){
        if (nums.length == 1){
            return true;
        }

        return nums[0] <= nums[1] && isSortedBad(Arrays.copyOfRange(nums, 1, nums.length));

    }

    public static boolean contains(int[] nums, int index, int item){
        if (index == nums.length){
            return false;
        }

        return nums[index] == item || contains(nums, index+1, item);
    }
}
