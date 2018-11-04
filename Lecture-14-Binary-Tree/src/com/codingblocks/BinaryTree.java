package com.codingblocks;

import java.io.File;
import java.io.PrintStream;
import java.util.*;

public class BinaryTree {

    private Node root;

//    private File output = new File("output.txt");
//    private PrintStream out;


    public void populate(String data)throws Exception{

//        File file = new File("input.txt");

        Scanner scanner = new Scanner(data);

        System.out.println("Enter the root node");

        int value = scanner.nextInt();

        root = new Node(value);

        populate(root, scanner);
    }

    private void populate(Node node, Scanner scanner) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Do you want left child of " + node.value);

        boolean left = scanner.nextBoolean();

        if (left){
//            System.out.println("Enter left child of " + node.value);
            node.left = new Node(scanner.nextInt());
            populate(node.left, scanner);
        }

//        System.out.println("Do you want right child of " + node.value);
        boolean right = scanner.nextBoolean();
        if (right){
//            System.out.println("Enter right child of " + node.value);
            node.right = new Node(scanner.nextInt());
            populate(node.right, scanner);
        }
    }

    public void inOrder(){
        inOrder(root);
    }


    private void inOrder(Node node) {
        if (node == null){
            return;
        }

        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    public int height(){
        return depth(root);
    }

    public int diameter(){
        if (root == null){
            return 0;
        }

        return depth(root.left) + depth(root.right) + 1;
    }

    private int depth(Node node){
        if (node == null){
            return 0;
        }

        return Math.max(depth(node.left), depth(node.right)) + 1;
    }

    public boolean find(int value){
        return find(value, root);
    }

    private boolean find(int value, Node node) {
        if (node == null){
            return false;
        }

        return node.value == value || find(value, node.left) || find(value, node.right);
    }

    public void mirror(){
        mirror(root);
    }


    public void printLevelOrder(int level){
        printLevelOrder(root, level);
    }

    private void printLevelOrder(Node node, int level) {
        if (node == null){
            return;
        }

        if (level == 0) {
            System.out.println(node.value);
        }

        if (level > 0) {
            printLevelOrder(node.left, level - 1);

            printLevelOrder(node.right, level - 1);
        }
    }

    public void levelOrder(){

        Queue<Node> queue = new LinkedList<>();

        int level = 0;

        queue.add(root);
        queue.add(null);

        while (queue.size() > 1){
            Node front = queue.remove();

            if (front == null){
                queue.add(null);
                level++;
                continue;
            }

            System.out.println(front.value + " with level " + level);

            if (front.left != null){
                queue.add(front.left);
            }

            if (front.right != null){
                queue.add(front.right);
            }
        }
    }

    private void mirror(Node node) {
        if(node == null){
            return;
        }

        Node temp = node.left;
        node.left = node.right;
        node.right = temp;

        mirror(node.left);
        mirror(node.right);
    }

    public void generateByPreIn(int[] pre, int[] in){
        root = generater(pre, in);
    }

    private Node generater(int[] pre, int[] in) {

        if (pre.length == 0){
            return null;
        }

        int value = pre[0];

        int index = findIndex(in, value);

        int[] in_left = Arrays.copyOfRange(in, 0, index);
        int[] in_right = Arrays.copyOfRange(in, index + 1, in.length);

        int[] pre_left = Arrays.copyOfRange(pre, 1, index + 1);
        int[] pre_right = Arrays.copyOfRange(pre, index + 1, pre.length);

        Node node = new Node(value);

        node.left = generater(pre_left, in_left);
        node.right = generater(pre_right, in_right);

        return node;
    }

    private int findIndex(int[] in, int value) {
        for (int i = 0; i < in.length; i++) {
            if (in[i] == value){
                return i;
            }
        }

        return -1;
    }

    private class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }
}
