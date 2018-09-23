package com.codingblocks;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        int[] nums = {54, 154, 34, 765, 434};

//        int[] data = input();
//
//        display(data);

        System.out.println(max(nums));


//        display(nums);
//
//        dub(nums);
//
//        display(nums);
//
//        swap(nums, 0, 2);
//
//        display(nums);
    }

    public static void display(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }

        System.out.println("END");
    }

    public static void dub(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * 2;
        }
    }

    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static int[] input(){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = s.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + i + " : ");
            nums[i] = s.nextInt();
        }

        return nums;
    }

    public static int max(int[] nums){
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[max]){
                max = i;
            }
        }

        return max;
    }

    public static int max(int[] nums, int first, int last){
        int max = first;

        for (int i = first; i <= last; i++) {
            if (nums[i] > nums[max]){
                max = i;
            }
        }

        return max;
    }

    public static int second(int[] nums){
        int first = 0;
        int second = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[first]){
                second = first;
                first = i;
            } else if(nums[i] < nums[first] && (second == -1 || nums[i] > nums[second])){
                second = i;
            }
        }

        return second;
    }
}
