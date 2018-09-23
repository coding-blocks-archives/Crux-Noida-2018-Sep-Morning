package com.codingblocks;

public class Sorting {
    public static void main(String[] args) {
        int[] nums = {54, 76, 76, 53, 987, 43};

        insertion(nums);

        Examples.display(nums);
    }

    public static void bubble(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j- 1] > nums[j]){
                    Examples.swap(nums, j-1, j);
                }
            }
        }
    }

    public static void selection(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - 1 - i;

            int max = Examples.max(nums, 0, last);

            Examples.swap(nums, max, last);
        }
    }

    public static void insertion(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if (nums[j] < nums[j-1]){
                    Examples.swap(nums, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
}
