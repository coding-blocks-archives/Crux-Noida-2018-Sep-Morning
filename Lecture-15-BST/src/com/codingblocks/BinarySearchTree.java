package com.codingblocks;

import javafx.scene.chart.ValueAxis;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BinarySearchTree <T extends Comparable<T>> {

    private Node root;

    public void generateFromSorted(ArrayList<T> list){
        generateFromSorted(list, 0, list.size());
    }

    private void generateFromSorted(ArrayList<T> list, int start, int end) {
        if (start >= end){
            return;
        }

        int mid = (start + end - 1) / 2;

        insert(list.get(mid));

        generateFromSorted(list, start, mid);
        generateFromSorted(list, mid + 1, end);
    }

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

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    private int height(Node node){
        if (node == null){
            return -1;
        }

        return node.height;
    }

    public void display(){
        display(root, "root", "");
    }

    private void display(Node node, String position, String indent) {
        if (node == null){
            return;
        }

        System.out.println(indent + node.value + " " + position + " with height " + node.height);

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

    public boolean find(T value){
        return find(value, root);
    }

    private boolean find(T value, Node node) {
        if (node == null){
            return false;
        }

        if (node.value.compareTo(value) > 0){
            return find(value, node.left);
        }

        if (node.value.compareTo(value) < 0){
            return find(value, node.right);
        }

        return true;
    }

    public LinkedList<T> sorted(){
        LinkedList<T> list = new LinkedList<>();

        sorted(root, list);

        return list;
    }

    private void sorted(Node node, LinkedList<T> list) {
        if (node == null){
            return;
        }

        sorted(node.left, list);
        list.addLast(node.value);
        sorted(node.right, list);
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }

        if (Math.abs(height(node.left) - height(node.right)) > 1 ){
            return false;
        }

        return balanced(node.left) && balanced(node.right);
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

    public boolean isBST(){
        return isBST(root, null, null);
    }

    private boolean isBST(Node node, T max, T min) {
        if (node == null){
            return true;
        }

        if (min != null && node.value.compareTo(min) <= 0){
            return false;
        }

        if (max != null && node.value.compareTo(max) >= 0){
            return false;
        }

        return isBST(node.left, node.value, min) && isBST(node.right, max, node.value);
    }


    private class Node {
        private T value;
        private Node left;
        private Node right;

        private int height;

        public Node(T value) {
            this.value = value;
            this.height = 0;
        }
    }
}