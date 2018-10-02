package com.codingblocks;

import java.util.ArrayList;

public class ReturnList {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> list = subseq("", "abc");
        System.out.println(list);
    }

    public static ArrayList<String> subseq(String processed, String unprocessed){

        ArrayList<String> list = new ArrayList<>();


        if (unprocessed.isEmpty()){
            list.add(processed);
            return list;
        }

        char ch = unprocessed.charAt(0);

        unprocessed = unprocessed.substring(1);

        list.addAll(subseq(processed + ch, unprocessed));
        list.addAll(subseq(processed, unprocessed));

        return list;
    }

    public static void subseq_ascii(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        subseq_ascii(processed + ch, unprocessed);
        subseq_ascii(processed + (int)(ch), unprocessed);
        subseq_ascii(processed, unprocessed);
    }

    public static ArrayList<String> numpad(String processed, String unprocessed){

        ArrayList<String> list = new ArrayList<>();

        if (unprocessed.isEmpty()){
            list.add(processed);
            return list;
        }

        int digit = unprocessed.charAt(0) - '0';

        unprocessed = unprocessed.substring(1);

        for (int i = (digit-1)*3; i < digit * 3 && i < 26; i++) {
            char ch = (char)(i + 'a');
            list.addAll(numpad(processed + ch, unprocessed));
        }

        return list;
    }


    public static void permutation(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        for (int i = 0; i < unprocessed.length(); i++) {
            char ch = unprocessed.charAt(i);
            permutation(processed + ch,
                    unprocessed.substring(0, i)
                            + unprocessed.substring(i+1));
        }
    }

    public static void board(String processed, int target){
        if (target == 0){
            System.out.println(processed);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            board(processed+i, target - i);
        }
    }

}
