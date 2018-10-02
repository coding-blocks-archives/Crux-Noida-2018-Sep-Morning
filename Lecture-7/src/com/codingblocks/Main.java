package com.codingblocks;

public class Main {

    public static void main(String[] args) {
	// write your code here
        permutation("", "abc");
    }

    public static void subseq(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        unprocessed = unprocessed.substring(1);

        subseq(processed + ch, unprocessed);
        subseq(processed, unprocessed);
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

    public static void numpad(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        int digit = unprocessed.charAt(0) - '0';

        unprocessed = unprocessed.substring(1);

        for (int i = (digit-1)*3; i < digit * 3 && i < 26; i++) {
            char ch = (char)(i + 'a');
            numpad(processed + ch, unprocessed);
        }
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
