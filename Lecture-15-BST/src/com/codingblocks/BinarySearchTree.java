package com.codingblocks;

import javafx.scene.chart.ValueAxis;

import java.util.LinkedList;
import java.util.Queue;

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
        display(root, "root", "");
    }

    private void display(Node node, String position, String indent) {
        if (node == null){
            return;
        }

        System.out.println(indent + node.value + " " + position);

        display(node.left, "left", indent + "    ");
        display(node.right, "right", indent + "    ");

    }


    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node){
        if (node == null){
            return;
        }

        System.out.println(node.value);

        preOrder(node.left);
        preOrder(node.right);
    }

    public void between(T k1, T k2){
        between(k1, k2, root);
    }

    private void between(T k1, T k2, Node node) {
        if (node == null){
            return;
        }

        if (node.value.compareTo(k1) >= 0 && node.value.compareTo(k2) <= 0) {
            System.out.println(node.value);
        }

        if (node.value.compareTo(k1) >= 0){
            between(k1, k2, node.left);
        }

        if (node.value.compareTo(k2) <= 0){
            between(k1, k2, node.right);
        }
    }

    public void levelOrder(){

        if (root == null){
            return;
        }

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()){
            Node front = queue.remove();

            System.out.println(front.value);

            if (front.left != null){
                 queue.add(front.left);
            }

            if (front.right != null){
                 queue.add(front.right);
            }
        }
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