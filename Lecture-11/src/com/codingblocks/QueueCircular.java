package com.codingblocks;

public class QueueCircular {

    private int[] data;

    private int front;

    private int end;

    private int size;

    private static final int DEFAULT_SIZE = 10;

    public QueueCircular(){
        data =  new int[DEFAULT_SIZE];
        front = 0;
        end = -1;

        size = 0;

    }

    public boolean enqueue(int item){
        if (isFull()){
            return false;
        }

        end = (end + 1) % data.length;

        data[end] = item;

        size++;

        return true;
    }

    public int dequeue() throws Exception{
        if (isEmpty()){
            throw new Exception("Removing from empty queue");
        }

        int temp = data[front];

        front = (front + 1) % data.length;

        size--;

        return temp;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == data.length;
    }

    public void display(){
        for (int i = 0; i < size ; i++) {
            System.out.print(data[(i + front) % data.length]+ ", ");
        }

        System.out.println("End");
    }
}
