package com.codingblocks;

public class DynamicQueue extends QueueCircular {

    @Override
    public boolean enqueue(int item) {

        if (isFull()){
            int[] temp = new int[data.length * 2];

            // straight up the old circular queue
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }

            // update front and end before updating data
            front = 0;
            end = data.length - 1;

            data = temp;

        }

        return super.enqueue(item);
    }
}
