package com.codingblocks;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashTable <K, V> {

    private ArrayList<LinkedList<Node>> entries;

    private static final int DEFAULT_SIZE = 100;

    public HashTable() {
        entries = new ArrayList<>();

        for (int i = 0; i < DEFAULT_SIZE; i++) {
            entries.add(new LinkedList<>());
        }

    }

    public void put(K key, V value){
        int hash = Math.abs(key.hashCode()) % entries.size();

        LinkedList<Node> list = entries.get(hash);

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
