package com.codingblocks;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {

        int[] nums = {12, 123, 6, 345, 34, 67};

        System.out.println(findFirst(nums, 0, 6));
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

    public static int findFirst(int[] nums, int index, int item){
        if (index == nums.length){
            return -1;
        }

        if (nums[index] == item){
            return index;
        } else {
            return findFirst(nums, index+1, item);
        }
    }
}
