package com.codingblocks;

import java.util.LinkedList;

public class MapLinkedList <K, V> {

    private LinkedList<Node> list;

    public MapLinkedList() {
        this.list = new LinkedList<>();
    }

    public void put(K key, V value){

        for (Node node : list) {
            if (node.key.equals(key)){
                node.value = value;
                return;
            }
        }

        list.add(new Node(key, value));
    }

    private class Node {
        private K key;
        private V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
