package com.codingblocks;

public class EggDrop {
    public static void main(String[] args) {

        int egg = 4;
        int floor = 100000;

        Integer[][] mem = new Integer[floor + 1][egg + 1];

        System.out.println(eggdropDPItr(floor, egg, mem));
    }

    public static int eggdrop(int floor, int egg) {
        if (floor == 0) {
            return 0;
        }

        if (egg == 1) {
            return floor;
        }

        int min = Integer.MAX_VALUE;

        for (int f = 1; f <= floor; f++) {
            int toota = eggdrop(f - 1, egg - 1);
            int saabut = eggdrop(floor - f, egg);

            int value = Math.max(toota, saabut) + 1;

            if (value < min) {
                min = value;
            }
        }

        return min;
    }

    public static int eggdropDP(int floor, int egg, Integer[][] mem) {
        if (floor == 0) {
            return 0;
        }

        if (egg == 1) {
            return floor;
        }

        if (mem[floor][egg] != null) {
            return mem[floor][egg];
        }

        int min = Integer.MAX_VALUE;

        for (int f = 1; f <= floor; f++) {
            int toota = eggdropDP(f - 1, egg - 1, mem);
            int saabut = eggdropDP(floor - f, egg, mem);

            int value = Math.max(toota, saabut) + 1;

            if (value < min) {
                min = value;
            }
        }

        mem[floor][egg] = min;

        return mem[floor][egg];
    }

    public static int eggdropDPItr(int floor, int egg, Integer[][] mem) {

        for (int f = 0; f <= floor ; f++) {
            for (int e = 1; e <= egg; e++) {
                if (f == 0){
                    mem[f][e] = 0;
                } else if(e == 1){
                    mem[f][e] = f;
                } else {
                    int min = Integer.MAX_VALUE;

                    for (int i = 1; i <= f; i++) {
                        int toota = mem[i-1][e-1];
                        int saboot = mem[f - i][e];

                        int value = Math.max(toota, saboot) + 1;

                        if (value < min){
                            min = value;
                        }
                    }

                    mem[f][e] = min;
                }
            }
        }

        return mem[floor][egg];
    }
}