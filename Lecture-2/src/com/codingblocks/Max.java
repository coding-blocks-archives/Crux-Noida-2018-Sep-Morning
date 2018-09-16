package com.codingblocks;

public class Max {
    public static void main(String[] args) {

        int a = 45;
        int b = 675;
        int c = 667;

        int max = a;

//        if (max < b){
//            max = b;
//        }
//
//        if (max < c){
//            max = c;
//        }

        max = max < b ? b : max;
        max = max < c ? c : max;




        System.out.println(max);

    }
}
