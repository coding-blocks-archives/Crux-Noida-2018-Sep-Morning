package com.codingblocks;

public class Count {

    public static void main(String[] args) {
	// write your code here
        permutation("", "abc");
    }

    public static int subseq(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            return 1;
        }

        char ch = unprocessed.charAt(0);

        unprocessed = unprocessed.substring(1);

        int c = 0;

        c += subseq(processed + ch, unprocessed);
        c += subseq(processed, unprocessed);

        return c;
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


    public static int permutation(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            return 1;
        }

        int c = 0;
        for (int i = 0; i < unprocessed.length(); i++) {
            char ch = unprocessed.charAt(i);
            c += permutation(processed + ch,
                    unprocessed.substring(0, i)
                            + unprocessed.substring(i+1));
        }

        return c;
    }

    public static int board(String processed, int target){
        if (target == 0){
            return 1;
        }

        int c = 0;
        for (int i = 1; i <= 6 && i <= target; i++) {
            c += board(processed+i, target - i);
        }

        return c;
    }

}
