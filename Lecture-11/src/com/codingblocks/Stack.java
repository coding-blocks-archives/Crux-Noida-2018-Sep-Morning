package com.codingblocks;

public class Stack {

    private int[] data;
    private int top = -1;

    private static final int DEFAULT_SIZE = 5;

    public Stack(){
        this.data = new int[DEFAULT_SIZE];
    }

    public boolean push(int item){
        if (isFull()){
            return false;
        }

        data[++top] = item;

        return true;
    }

    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Removing from Empty Stack");
        }
        return data[top--];
    }

    public int top(){
        return data[top];
    }

    public boolean isFull(){
        return top == data.length - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void display(){
        for (int i = 0; i <= top ; i++) {
            System.out.print(data[i] +", ");
        }

        System.out.println("End");
    }


}
