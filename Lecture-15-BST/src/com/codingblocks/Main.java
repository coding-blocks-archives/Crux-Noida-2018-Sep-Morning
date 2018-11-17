package com.codingblocks;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int a = 345;

        int len = Integer.toString(a).length();

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

//        bst.insert(10);
//        bst.insert(5);
//        bst.insert(20);
//        bst.insert(15);
//        bst.insert(7);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        bst.generateFromSorted(list);

//        bst.levelOrder();

        System.out.println(bst.isBST());

        bst.display();

//        LinkedList<Integer> list = bst.sorted();
//
//        for (Integer item : list) {
//            System.out.println(item);
//        }

    }
}
