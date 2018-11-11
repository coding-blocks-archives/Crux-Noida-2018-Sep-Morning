package com.codingblocks;

import java.util.ArrayList;

public class MapUsingHash <K, V> {

    private ArrayList<Node> list;

    private static final int DEFAULT_SIZE = 100;

    public MapUsingHash() {
        list = new ArrayList<>();

        for (int i = 0; i < DEFAULT_SIZE; i++) {
            list.add(null);
        }
    }

    public void put(K key, V value){
        int hash = Math.abs(key.hashCode()) % list.size();

        list.set(hash, new Node(key, value));
    }

    public V get(K key){
        int hash = Math.abs(key.hashCode()) % list.size();

        if (list.get(hash) == null){
            return null;
        } else {
            return list.get(hash).value;
        }
    }

    public void remove(K key){
        int hash = Math.abs(key.hashCode()) % list.size();

        list.set(hash, null);
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
