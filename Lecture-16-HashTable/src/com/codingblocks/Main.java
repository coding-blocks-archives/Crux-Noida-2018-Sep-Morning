package com.codingblocks;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        MapLinkedList<String, String> dict = new MapLinkedList<>();

        dict.put("apple", "a sweet red fruit");

        System.out.println("help".hashCode());

        dict.put("mango", "king of fruits");

        dict.put("mango", "queen of fruits");

        System.out.println(dict.get("apple"));

        System.out.println(dict.keySet());

        System.out.println(dict.values());

        dict.remove("apple");

        System.out.println(dict.get("apple"));

        System.out.println(dict.keySet());



    }
}
