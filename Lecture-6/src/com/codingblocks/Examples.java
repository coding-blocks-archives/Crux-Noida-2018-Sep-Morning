package com.codingblocks;

public class Examples {
    public static void main(String[] args) {

        int res = sumn(7);
        System.out.println(res);
    }

    public static int sumn(int num){
        if (num == 0){
            return 0;
        }

        return num + sumn(num-1);
    }

    public static int fact(int n){

        if (n == 0){
            return 1;
        }

        return n * fact(n-1);
    }

    public static int fibo(int num){
        if (num < 2){
            return num;
        }

        return fibo(num-1) + fibo(num-2);
    }

    public static int power(int x, int n){
        if (n == 0){
            return 1;
        }

        return x * power(x, n-1);
    }
}


