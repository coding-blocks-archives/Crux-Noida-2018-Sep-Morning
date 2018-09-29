package com.codingblocks;

public class StringExamples {
    public static void main(String[] args) {
        String greet = "hello";
        String meet = "hello";

        String place = new String("world");

        System.out.println(greet);
        System.out.println(place);

        String salute = greet + place;

        System.out.println(salute);

        System.out.println(greet.equals(meet));

        System.out.println("apple".compareTo("danana"));
        System.out.println("capple".compareTo("banana"));
        System.out.println("banana".compareTo("banana"));

        System.out.println("banana".substring(1));
        System.out.println("banana".substring(0, 2));


        substrings(greet);

        System.out.println(greet.indexOf('l'));  // first occ of char
        System.out.println(greet.indexOf("lo")); // first occ of string

        System.out.println(greet.startsWith("hel"));
        System.out.println(greet.startsWith("heb"));
        System.out.println(greet.startsWith("llo", 2));


    }

    public static void substrings(String line){
        for (int i = 0; i < line.length(); i++) {
            for (int j = i+1; j <= line.length() ; j++) {
                System.out.println(line.substring(i, j));
            }
        }

        allOcc("hello moto", 'o');
    }

    public static void allOcc(String line, char ch){

        int loc = 0;

        while (true){
            int find = line.indexOf(ch, loc);

            if (find == -1){
                break;
            }

            System.out.println(find);

            loc = find + 1;
        }

    }


}
