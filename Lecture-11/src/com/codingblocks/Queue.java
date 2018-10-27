package com.codingblocks;

public class Queue {

    private int[] data;

    private int front;

    private int end;

    private int size;

    private static final int DEFAULT_SIZE = 10;

    public Queue(){
        data =  new int[DEFAULT_SIZE];
        front = 0;
        end = -1;

    }

    public boolean enqueue(int item){
        if (isFull()){
            return false;
        }

        data[++end] = item;

        return true;
    }

    public int dequeue() throws Exception{
        if (isEmpty()){
            throw new Exception("Removing from empty queue");
        }

        return data[front++];
    }

    public boolean isEmpty(){
        return front > end;
    }

    public boolean isFull(){
        return end == data.length - 1;
    }

    public void display(){
        for (int i = front; i <= end ; i++) {
            System.out.print(data[i]+ ", ");
        }

        System.out.println("End");
    }
}
