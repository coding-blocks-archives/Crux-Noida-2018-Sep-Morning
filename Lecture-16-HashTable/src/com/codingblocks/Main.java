package com.codingblocks;

public class Main {

    public static void main(String[] args) {

        HashTable<Integer, Integer> dict = new HashTable<>();

//        dict.put("apple", "a sweet red fruit");
//
//        System.out.println("help".hashCode());
//
//        dict.put("mango", "king of fruits");
//
//        dict.put("mango", "queen of fruits");
//
//        System.out.println(dict.get("apple"));
//
//        System.out.println(dict.keySet());
//
//        System.out.println(dict.values());
//
//        dict.remove("apple");
//
//        System.out.println(dict.get("apple"));
//
//        System.out.println(dict.keySet());

        for (int i = 0; i < 200000; i++) {
            dict.put(i, i);
        }

//        System.out.println(dict.size());

        System.out.println(dict.keySet());

    }
}
