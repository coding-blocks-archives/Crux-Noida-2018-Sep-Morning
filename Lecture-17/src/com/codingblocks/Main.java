package com.codingblocks;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> data = new ArrayList<>();

        data.add(12);
        data.add(567);
        data.add(6);
        data.add(75);
        data.add(768);

        data.add(754);
        data.add(98);

        Heap<Integer> heap = new Heap<>();

        data = heap.heapSort(data);

        System.out.println(data);
    }
}
