package com.codingblocks;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int start = s.nextInt();
        int end = s.nextInt();
        int step = s.nextInt();

        System.out.println(start);
        System.out.println(end);
        System.out.println(step);

        for (int i = start; i <= end; i += step) {
            float c = (5f/9) * (i-32);
            System.out.println(c);
        }
    }
}
