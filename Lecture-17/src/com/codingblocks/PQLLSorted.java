package com.codingblocks;

import com.sun.org.apache.regexp.internal.RE;

import java.util.LinkedList;

public class PQLLSorted<T extends Comparable<T>>  {

    private LinkedList<T> list = new LinkedList<>();

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void add(T item){
        int index = 0;

        for (T value : list) {
            if (value.compareTo(item) > 0){
                break;
            }
            index++;
        }

        list.add(index, item);
    }

    public T min(){
        return list.get(0);
    }

    public T remove(){
        return list.removeFirst();
    }
}
