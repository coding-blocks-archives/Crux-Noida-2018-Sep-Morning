package com.codingblocks;

public class Main {

    public static void main(String[] args) {

//        int[] nums = new int[10];
        int[] nums = {12, 34, 67, 56, 37};
        int[] numbers = {12, 34,657, 7564};

//        System.out.println(nums[9]);

        System.out.println(nums.length);

//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

        System.out.println(numbers);

        display(numbers);

        numbers[3]= 6754365;

        display(numbers);


    }

    public static void display(int[] data){

        System.out.println(data);

//        data = new int[45];

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
