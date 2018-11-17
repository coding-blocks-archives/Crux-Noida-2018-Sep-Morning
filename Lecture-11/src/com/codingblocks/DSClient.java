package com.codingblocks;

public class DSClient {

    public static void main(String[] args) {
        Stack stack = new DynamicStack();

        for (int i = 0; i < 10000; i++) {
            stack.push((int)(Math.random()*1000));
//            stack.display();
        }
    }
}
