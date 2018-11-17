package com.codingblocks;

import java.util.ArrayList;

public class Heap <T extends Comparable<T>> {

    private ArrayList<T> list = new ArrayList<>();

    public void add(T item){
        list.add(item);

        upheap(list.size() - 1);
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public T min(){
        return list.get(0);
    }

    private void upheap(int index) {
        if (index == 0){
            return;
        }

        int parent = parent(index);

        if (list.get(index).compareTo(list.get(parent)) < 0){
            swap(index, parent);
            upheap(parent);
        }

    }

    public T remove(){
        T temp = list.get(0);

        // downheap
        T last = list.remove(list.size() - 1);

        if (!list.isEmpty()) {
            list.set(0, last);
            downheap(0);
        }

        return temp;

    }

    private void downheap(int index) {
        int left = left(index);
        int right = right(index);

        int min = index;

        if (left < list.size() && list.get(left).compareTo(list.get(min)) < 0){
            min = left;
        }

        if (right < list.size() && list.get(right).compareTo(list.get(min)) < 0){
            min = right;
        }

        if (min != index){
            swap(index, min);
            downheap(min);
        }
    }

    private void swap(int first, int second){
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    public int parent(int index){
        return (index - 1)/2;
    }

    public int left(int index){
        return index * 2 + 1;
    }

    public int right(int index){
        return index * 2 + 2;
    }

    public ArrayList<T> heapSort(ArrayList<T> data){
        list = new ArrayList<>();

        for (T item : data) {
            add(item);
        }

        ArrayList<T> sorted = new ArrayList<>();

        while (!isEmpty()){
            sorted.add(remove());
        }

        return sorted;
    }


}
