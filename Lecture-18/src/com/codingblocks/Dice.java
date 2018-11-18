package com.codingblocks;

import java.math.BigInteger;

public class Dice {
    public static void main(String[] args) {
        System.out.println(diceDPItr(100000, 6));
    }

    public static int dice(int target, int faces){
        if (target == 0){
            return 1;
        }

        int sum = 0;

        for (int i = 1; i <= faces && i <= target; i++) {
            sum += dice(target - i, faces);
        }

        return sum;
    }

    public static BigInteger diceDPItr(int target, int faces){
        BigInteger[] mem = new BigInteger[target + 1];

        return diceDPItr(target, faces, mem);
    }

    private static BigInteger diceDP(int target, int faces, BigInteger[] mem){
        if (target == 0){
            return BigInteger.ONE;
        }

        if(mem[target] != null){
            return mem[target];
        }

        BigInteger sum = BigInteger.ZERO;

        for (int i = 1; i <= faces && i <= target; i++) {
            sum = sum.add(diceDP(target - i, faces, mem));
        }

        mem[target] = sum;

        return sum;
    }

    private static BigInteger diceDPItr(int target, int faces, BigInteger[] mem){
        for (int t = 0; t <= target; t++) {
            if (t == 0){
                mem[t] = BigInteger.ONE;
            } else {

                BigInteger sum = BigInteger.ZERO;

                for (int i = 1; i <= faces && i <= t ; i++) {
                    sum = sum.add(mem[t-i]);
                }

                mem[t] = sum;
            }
        }

        return mem[target];
    }

}
