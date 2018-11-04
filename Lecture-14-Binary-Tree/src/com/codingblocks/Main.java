package com.codingblocks;

public class Main {
    public static void main(String[] args) throws Exception {
        BinaryTree tree = new BinaryTree();

        int[] pre = {10, 12, 5, 6, 8};
        int[] in = {5, 12, 6, 10, 8};

        tree.generateByPreIn(pre, in);

//        tree.populate("10 true 12 true 5 false false true 6 false false true 8 false false");
//        tree.inOrder();



//
//        BinaryTree tree2 = new BinaryTree();
//        tree2.populate("10 false false");
//        tree2.inOrder();

        tree.levelOrder();



    }
}
