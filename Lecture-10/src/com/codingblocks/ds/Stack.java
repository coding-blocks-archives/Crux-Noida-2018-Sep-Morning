package com.codingblocks.ds;

import java.util.ArrayList;

public class Stack {

    private ArrayList<Integer> data;

    public Stack(){
        this.data = new ArrayList<>();
    }

    public void push(int item){
        this.data.add(item);
    }

    public int pop(){
        return this.data.remove(data.size() - 1);
    }

    public int top(){
        return this.data.get(data.size() - 1);
    }

    public boolean isEmpty(){
        return this.data.isEmpty();
    }

    public void display(){
        for (int i = 0; i < data.size(); i++) {
            System.out.print(data.get(i) + ", ");
        }
        System.out.println("End");
    }
}
