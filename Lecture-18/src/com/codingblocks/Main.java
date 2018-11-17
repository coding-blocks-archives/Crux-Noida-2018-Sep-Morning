package com.codingblocks;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int num = 50;

        System.out.println(fiboDPItrMap(10000));
    }

    public static int fibo(int num){
        if (num <= 1){
            return num;
        } else {
            return fibo(num - 1) + fibo(num - 2);
        }

    }

    public static long fiboDP(int num, long[] mem){
        if (num <= 1){
            return num;
        }

        if (mem[num] != 0){
            return mem[num];
        }

        mem[num] =  fiboDP(num - 1, mem) + fiboDP(num - 2, mem);

        return mem[num];
    }

    public static long fiboDPItr(int num, long[] mem){
        for (int i = 0; i <= num ; i++) {
            if (i <= 1){
                mem[i] = i;
            } else {
                mem[i] = mem[i-1] + mem[i-2];
            }
        }

        return mem[num];
    }

    public static BigInteger fiboDPItrMap(int num){


        Map<Integer, BigInteger> map = new HashMap<>();

        for (int i = 0; i <= num ; i++) {
            if (i <= 1){
                map.put(i, new BigInteger(Integer.toString(i)));
            } else {
                map.put(i, map.get(i-1).add(map.get(i-2)));
            }
        }

        return map.get(num);
    }
}
