package com.codingblocks;

public class QueueClient {
    public static void main(String[] args) throws Exception{
        QueueCircular queue = new QueueCircular();

        queue.enqueue(67);
        queue.enqueue(78);
        queue.enqueue(7867);
        queue.enqueue(789);
        queue.enqueue(767);

        queue.display();

        for (int i = 0; i < 5; i++) {
            queue.dequeue();
            queue.display();
        }
    }
}
