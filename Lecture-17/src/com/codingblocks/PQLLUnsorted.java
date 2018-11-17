package com.codingblocks;

import java.util.LinkedList;

public class PQLLUnsorted <T extends Comparable<T>>  {

    private LinkedList<T> list = new LinkedList<>();

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void add(T item){
        list.addFirst(item);
    }

    public T min(){
        T min = list.get(0);

        for (T item : list) {
           if (item.compareTo(min) < 0){
               min = item;
           }
        }

        return min;
    }

    public T remove(){
        T min = list.get(0);

        for (T item : list) {
            if (item.compareTo(min) < 0){
                min = item;
            }
        }

        list.remove(min);

        return min;
    }
}
