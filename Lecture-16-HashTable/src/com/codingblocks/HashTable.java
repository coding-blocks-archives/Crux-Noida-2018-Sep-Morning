package com.codingblocks;

import java.util.*;

public class HashTable <K, V> {

    private ArrayList<List<Node>> entries;

    private int size = 0;

    private float load_factor = .5f;

    private static final int DEFAULT_SIZE = 100;

    public HashTable() {
        entries = new ArrayList<>();

        for (int i = 0; i < DEFAULT_SIZE; i++) {
            entries.add(new ArrayList<>());
        }

    }

    public void put(K key, V value){
        int hash = Math.abs(key.hashCode()) % entries.size();

        List<Node> list = entries.get(hash);

        for (Node node : list) {
            if (node.key.equals(key)){
                node.value = value;
                return;
            }
        }

        list.add(new Node(key, value));

        size++;

        if ((((float)size)/entries.size()) > load_factor){
            rehash();
        }
    }

    private void rehash() {

        System.out.println("Rehashing in progress");

        ArrayList<List<Node>> old = entries;

        entries = new ArrayList<>();

        for (int i = 0; i < old.size() * 2; i++) {
            entries.add(new ArrayList<>());
        }

        size = 0;

        for (List<Node> list : old) {
            for (Node node : list) {
                put(node.key, node.value);
            }
        }
    }

    public V get(K key){
        int hash = Math.abs(key.hashCode()) % entries.size();

        List<Node> list = entries.get(hash);

        for (Node node : list) {
            if (node.key.equals(key)){
                return node.value;
            }
        }

        return null;
    }

    public void remove(K key){
        int hash = Math.abs(key.hashCode()) % entries.size();

        List<Node> list = entries.get(hash);

        Node target = null;

        for (Node node : list) {
            if (node.key.equals(key)){
                target = node;
            }
        }

        if (target != null){
            size--;
            list.remove(target);
        }

    }

    public Set<K> keySet(){
        Set<K> set = new HashSet<>();

        for (List<Node> list : entries) {
            for (Node node : list) {
                set.add(node.key);
            }
        }

        return set;
    }

    public Set<V> values(){
        Set<V> set = new HashSet<>();

        for (List<Node> list : entries) {
            for (Node node : list) {
                set.add(node.value);
            }
        }

        return set;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
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
