package com.codingblocks;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list.size());

        list.add(4764);
        list.add(6754);
        list.add(675);
        list.add(7675);

        System.out.println(list.size());

        System.out.println(list.get(2));

//        list.set(4, 45678);

        System.out.println(list.get(2));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            list.set(i, list.get(i) * 2);
        }


        System.out.println(Integer.toBinaryString(34578567));
    }
}
