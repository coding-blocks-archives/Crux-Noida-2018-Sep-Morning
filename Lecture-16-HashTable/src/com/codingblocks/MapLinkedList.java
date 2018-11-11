package com.codingblocks;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

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

    public V get(K key){
        for (Node node : list) {
            if (node.key.equals(key)){
                return node.value;
            }
        }

        return null;
    }

    public void remove(K key){

        Node target = null;

        for (Node node : list) {
          if (node.key.equals(key)){
              target = node;
              break;
          }
        }

        list.remove(target);
    }

    public Set<K> keySet(){
        Set<K> set = new HashSet<>();
        for (Node node : list) {
            set.add(node.key);
        }

        return set;
    }

    public Set<V> values(){
        Set<V> set = new HashSet<>();
        for (Node node : list) {
            set.add(node.value);
        }

        return set;
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
