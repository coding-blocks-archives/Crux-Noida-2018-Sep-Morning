package com.codingblocks;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String> dict = new HashMap<>();

        dict.put("apple", "a sweet red fruit");
        dict.put("mango", "king of fruits");

        System.out.println(dict.get("apple"));

        System.out.println(dict.keySet());

        System.out.println(dict.values());

        dict.remove("apple");

        System.out.println(dict.get("apple"));

        System.out.println(dict.keySet());



    }
}
