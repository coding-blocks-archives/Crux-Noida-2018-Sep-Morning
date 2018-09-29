package com.codingblocks;

public class Questions {
    public static void main(String[] args) {
//        reverse("hello");

        System.out.println(toggle("I am a Great teacher"));

//        bakwas();
//
//        System.out.println("done");

//        System.out.println(isPallin("naman"));
//
//        printPallinSub("naman");
//
//        String name = "naman";
//
//        name = name.replace('n', 'N');
//
//        System.out.println(name);
    }

    public static void printLines(String line){
        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i));
        }
    }

    public static void reverse(String line){
        for (int i = line.length()-1; i >= 0 ; i--) {
            System.out.print(line.charAt(i));
        }
    }

    public static boolean isPallin(String line){
        for (int i = 0; i < line.length()/2; i++) {
            if (line.charAt(i) != line.charAt(line.length() - i - 1)){
                return false;
            }
        }

        return true;
    }

    public static void printPallinSub(String line){
        for (int i = 0; i < line.length(); i++) {
            for (int j = i+1; j <= line.length(); j++) {
                String temp = line.substring(i, j);
//                System.out.println(temp);
                if (isPallin(temp)){
                    System.out.println(temp);
                }
            }
        }
    }

    public static void bakwas(){
        StringBuilder l = new StringBuilder("a");

        for (int i = 0; i < 1000000; i++) {
            l.append("a");
        }
    }

    public static String caps(String line){
        StringBuilder builder = new StringBuilder(line);

        for (int i = 0; i < builder.length(); i++) {
            char ch = builder.charAt(i);

            if (ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - 'a' + 'A');
                builder.setCharAt(i, ch);
            }
        }

        return builder.toString();
    }

    public static String toggle(String line){
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - 'a' + 'A');
            }

            else if (ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch - 'A' + 'a');
            }

            builder.append(ch);
        }

        return builder.toString();
    }

    public static String oddEven(String line){
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            // processing

            while ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                if (i % 2 == 0){
                    ch = (char)(ch-1);
                } else {
                    ch = (char)(ch+1);
                }
            }



            builder.append(ch);
        }

        return builder.toString();
    }

    public static String diffInsert(String line){
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i < line.length(); i++) {
            char first = line.charAt(i-1);
            char second = line.charAt(i);
            int diff = Math.abs(first - second);

            builder.append(first);
            builder.append(diff);
        }

        builder.append(line.charAt(line.length()-1));

        return builder.toString();
    }
}
