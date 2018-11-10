package com.codingblocks;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.insert(10);
        bst.insert(5);
        bst.insert(20);
        bst.insert(15);
        bst.insert(7);

        bst.levelOrder();
    }
}
