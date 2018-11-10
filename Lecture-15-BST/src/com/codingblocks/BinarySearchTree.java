package com.codingblocks;

import javafx.scene.chart.ValueAxis;

public class BinarySearchTree <T extends Comparable<T>> {

    private Node root;

    public void insert(T value){
        root = insert(value, root);
    }

    private Node insert(T value, Node node) {
        if (node == null){
            return new Node(value);
        }

        if (node.value.compareTo(value) > 0){
            node.left = insert(value, node.left);
        }

        if (node.value.compareTo(value) < 0){
            node.right = insert(value, node.right);
        }

        return node;
    }

    public void display(){
        display(root, true, "");
    }

    private void display(Node node, boolean isLeft, String indent) {
        if (node == null){
            return;
        }

        System.out.println(indent + node.value + " " + isLeft);

        display(node.left, true, indent + "    ");
        display(node.right, false, indent + "    ");

    }


    private class Node {
        private T value;
        private Node left;
        private Node right;

        public Node(T value) {
            this.value = value;
        }
    }
}