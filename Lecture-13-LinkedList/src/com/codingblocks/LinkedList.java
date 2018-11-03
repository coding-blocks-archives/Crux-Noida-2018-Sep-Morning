package com.codingblocks;

public class LinkedList<T> {

    private Node head;
    private Node tail;
    private int size = 0;


    public LinkedList(){

    }

    public void insertFirst(T value){
        Node node = new Node(value, head);
        head = node;

        size++;

        if (tail == null){
            tail = head;
        }
    }

    public void insertLast(T value){

        // in case of first item, insertLast is same as insertFirst
        if (size == 0){
            insertFirst(value);
            return;
        }

        // Otherwise we are inserting sumit after old tail ruchika
        Node node = new Node(value);

        tail.next = node; // now ruchika loves sumit
        tail = node; // story will end with sumit now

        size++;
    }

    public T removeFirst() throws Exception{
        if (size == 0){
            throw new Exception("Removing from empty list");
        }

        Node node = head;

        head = head.next;
        size--;

        if (head == null){
            tail = null;
        }

        return node.value;
    }

    public T removeLast() throws Exception{
        if (size < 2){
            return removeFirst();
        }

        Node node = head;

        // get second last node in node
        while (node.next != tail){
            node = node.next;
        }

        // maintain last item to return later
        Node temp = tail;

        // switch tail to second last
        node.next = null;
        tail = node;

        size--;

        return temp.value;
    }

    public void display(){
        Node node = head;

        while (node != null){
            System.out.print(node.value +" -> ");
            node = node.next;
        }

        System.out.println("END");
    }

    public Node get(int index) throws Exception{

        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    public T remove(int index) throws Exception{
        if (index == 0){
            return removeFirst();
        }

        if(index == size - 1){
            return removeLast();
        }

        Node prev = get(index - 1);
        Node present = prev.next;

        prev.next = present.next;

        size--;

        return present.value;
    }

    public void insert(int index, T value) throws Exception{
        if (index == 0){
            insertFirst(value);
            return;
        }

        if (index == size){
            insertLast(value);
            return;
        }

        Node prev = get(index - 1);

        Node node = new Node(value, prev.next);
        prev.next = node;

        size++;
    }

    public int find(T value){
        Node node = head;

        int index = 0;

        while (node != null){
            if (node.value.equals(value)){
                return index;
            }
            node = node.next;
            index++;
        }

        return -1;
    }

    public void reverse(){
//        reverse(head);

        if (size < 2){
            return;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        tail = head; // tail is the first item in old list

        while (present != null){
            present.next = prev;

            // shift all 3 ref to right

            prev = present;
            present = next;

            if (next != null) {
                next = next.next;
            }
        }

        head = prev; // head is the last item in old list
    }

    private void reverse(Node node){
        if (node.next == null){
            head = tail;
            return;
        }

        reverse(node.next);

        tail.next = node; // adding prev item to the tail
        tail = node; // moving tail to prev item
        tail.next = null; // tail.next should always be null


    }

    private class Node {
        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
