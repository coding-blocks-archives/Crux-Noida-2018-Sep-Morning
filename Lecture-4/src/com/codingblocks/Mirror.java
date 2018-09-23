package com.codingblocks;

public class Mirror {
    public static void main(String[] args) {

    }

    public static int[] mirror(int[] nums){

        int[] result = new int[nums.length];

        for (int p = 0; p < nums.length; p++) {
            int v = nums[p];

            result[v] = p;
        }



        return result;
    }

    public static void reverse(int[] nums){
        for (int i = 0; i < nums.length/2; i++) {
            Examples.swap(nums, i, nums.length - i - 1);
        }
    }

}
