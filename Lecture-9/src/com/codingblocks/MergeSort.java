package com.codingblocks;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {12, 6, 45, 25, 11};

        mergeSortInplace(nums, 0, nums.length);

        System.out.println(Arrays.toString(nums));
    }

    public static int[] mergesort(int[] nums){

        if (nums.length == 1){
            return nums;
        }

        int mid = nums.length/2;

        int[] first = Arrays.copyOfRange(nums, 0, mid);
        int[] second = Arrays.copyOfRange(nums, mid, nums.length);

        return merge(mergesort(first), mergesort(second));
    }

    public static void mergeSortInplace(int[] nums, int start, int end){
        if (end - start == 1){
            return;
        }

        int mid = (start + end) / 2;

        mergeSortInplace(nums, start, mid);
        mergeSortInplace(nums, mid, end);

        mergeInplace(nums, start, end);
    }

    private static void mergeInplace(int[] nums, int start, int end) {
        int mid = (start + end)/2;

        int i = start;
        int j = mid;
        int k = 0;

        int[] merged = new int[end - start];

        while (i < mid && j < end){
            if(nums[i] < nums[j]){
                merged[k++] = nums[i++];
            } else {
                merged[k++] = nums[j++];
            }
        }

        while (i < mid){
            merged[k++] = nums[i++];
        }

        while (j < end){
            merged[k++] = nums[j++];
        }

        for (int l = 0; l < merged.length; l++) {
            nums[start + l] = merged[l];
        }
    }

    private static int[] merge(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length){

            if(first[i] < second[j]){
                merged[k++] = first[i++];
            } else {
                merged[k++] = second[j++];
            }
        }

        while (i < first.length){
            merged[k++] = first[i++];
        }

        while (j < second.length){
            merged[k++] = second[j++];
        }

        return merged;
    }
}
