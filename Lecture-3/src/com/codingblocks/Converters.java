package com.codingblocks;

public class Converters {
    public static void main(String[] args) {
        int bin = deci2bin(10);
        System.out.println(bin);
    }

    public static int deci2bin(int deci){
        int bin = 0;
        int pos = 1;

        while (deci > 0){
            int rem = deci % 2;
            deci = deci/2;

            bin = bin + pos * rem;
            pos = pos * 10;
        }

        return bin;
    }

    public static int deci2any(int deci, int base){
        int any = 0;
        int pos = 1;

        while (deci > 0){
            int rem = deci % base;
            deci = deci/base;

            any = any + pos * rem;
            pos = pos * 10;
        }

        return any;
    }

    public static int bin2deci(int bin){
        int deci = 0;
        int pos = 1;

        while (bin > 0){
            int rem = bin % 10;
            bin = bin / 10;

            deci = deci + pos * rem;
            pos = pos * 2;
        }

        return deci;
    }

    public static int any2deci(int any, int base){
        int deci = 0;
        int pos = 1;

        while (any > 0){
            int rem = any % 10;
            any = any / 10;

            deci = deci + pos * rem;
            pos = pos * base;
        }

        return deci;
    }
}
