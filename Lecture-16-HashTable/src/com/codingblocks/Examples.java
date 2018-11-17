package com.codingblocks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Examples {

    static  {
        System.out.println("Hello to my world");
    }

    public static void main(String[] args) {
        intersection();
    }

    public static void intersection(){
        int[] first = {23, 4, 56, 56};
        int[] second = {4, 56, 5};

        List<Integer> list = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        // generates freq map
        for (int item : first) {
            if (map.containsKey(item)){
                map.put(item, map.get(item) + 1);
            } else {
                map.put(item, 1);
            }
        }

        for (int item : second) {
            if (map.containsKey(item) && map.get(item) > 0){
                list.add(item);
                map.put(item, map.get(item) - 1);
            }
        }

        System.out.println(list);

    }
}
