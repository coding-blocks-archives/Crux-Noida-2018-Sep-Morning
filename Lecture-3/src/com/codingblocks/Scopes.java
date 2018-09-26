package com.codingblocks;

public class Scopes {
    public static void main(String[] args) {

        int c = 7;

        for (int i = 0; i < 10; i++) {
            System.out.println(c);

            c += 9;
        }

        System.out.println(c);


    }
}
