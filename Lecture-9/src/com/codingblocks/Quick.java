package com.codingblocks;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {

        int[] nums = {6, 1, 2, 7, 1, 6, 5};

        quicksort(nums, 0, nums.length);

        System.out.println(Arrays.toString(nums));
    }

    public static void quicksort(int[] nums, int start, int end){

        if (end - start <= 1){
            return;
        }

        int pivot = end - 1;

        pivot = pivot(nums, start, end, pivot);

        quicksort(nums, start, pivot);
        quicksort(nums, pivot + 1, end);
    }

    private static int pivot(int[] nums, int start, int end, int pivot) {

        int fm = start;

        System.out.println(nums);

        for (int p = start; p < pivot; p++) {
            if (nums[p] < nums[pivot]){
                int t = nums[fm];
                nums[fm] = nums[p];
                nums[p] = t;

                fm++;
            }
        }

        int t = nums[pivot];
        nums[pivot] = nums[fm];
        nums[fm] = t;

        return fm;
    }
}
