package com.codingblocks;

public class DQClient {

    public static void main(String[] args) {
        Queue queue = new DynamicQueue();

        for (int i = 0; i < 10000; i++) {
            queue.enqueue((int)(Math.random()*1000));
//            stack.display();
        }
    }
}
