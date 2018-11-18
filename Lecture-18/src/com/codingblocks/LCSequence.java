package com.codingblocks;

import java.util.Map;

public class LCSequence {
    public static void main(String[] args) {
        System.out.println(lcs("aman", "manan"));
    }

    public static int lcs(String first, String second) {
        if (first.isEmpty() || second.isEmpty()) {
            return 0;
        }

        char f = first.charAt(0);
        char s = second.charAt(0);

        if (f == s) {
            return 1 + lcs(first.substring(1), second.substring(1));
        }

        return Math.max(lcs(first.substring(1), second), lcs(first, second.substring(1)));
    }

    public static int lcsLast(String first, String second, int f_len, int s_len) {
        if (f_len == 0 || s_len == 0) {
            return 0;
        }

        char f = first.charAt(f_len - 1);
        char s = second.charAt(s_len - 1);

        if (f == s) {
            return 1 + lcsLast(first, second, f_len - 1, s_len - 1);
        }

        return Math.max(lcsLast(first, second, f_len - 1, s_len), lcsLast(first, second, f_len, s_len - 1));
    }

    public static int lcsLastDP(String first, String second, int f_len, int s_len, Integer[][] mem) {
        if (f_len == 0 || s_len == 0) {
            return 0;
        }

        if (mem[f_len][s_len] != null) {
            return mem[f_len][s_len];
        }

        char f = first.charAt(f_len - 1);
        char s = second.charAt(s_len - 1);

        if (f == s) {
            mem[f_len][s_len] = 1 + lcsLastDP(first, second, f_len - 1, s_len - 1, mem);
            return mem[f_len][s_len];
        }

        mem[f_len][s_len] = Math.max(lcsLastDP(first, second, f_len - 1, s_len, mem), lcsLastDP(first, second, f_len, s_len - 1, mem));
        return mem[f_len][s_len];
    }

    public static int lcsDPItr(String first, String second, Integer[][] mem) {

        for (int f_len = 0; f_len <= first.length(); f_len++) {
            for (int s_len = 0; s_len <= second.length(); s_len++) {
                if (f_len == 0 || s_len == 0){
                    mem[f_len][s_len] = 0;
                } else {
                    char f = first.charAt(f_len - 1);
                    char s = second.charAt(s_len - 1);

                    if (f == s){
                        mem[f_len][s_len] = 1 + mem[f_len - 1][s_len - 1];
                    } else {
                        mem[f_len][s_len] = Math.max(mem[f_len][s_len-1], mem[f_len-1][s_len]);
                    }
                }
            }
        }

        return mem[first.length()][second.length()];
    }
}
