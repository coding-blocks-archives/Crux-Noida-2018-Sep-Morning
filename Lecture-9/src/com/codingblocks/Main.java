package com.codingblocks;

public class Main {

    public static void main(String[] args) {
//        System.out.println(power(10, 15));

    }

    public static int countOnes(int num){

        int count = 0;

        while (num > 0){
            if ((num & 1) == 1){
                count++;
            }

            num = num >> 1;
        }

        return count;
    }

    public static long power(int x, int n){

        long place = x;
        long res = 1;

        while (n > 0){
            if ((n&1) == 1){
                res = res * place;
            }

            place = place * place;
            n = n >> 1;
        }

        return res;

    }
}
