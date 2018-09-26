package com.codingblocks;

public class Methods_Examples {
    public static void main(String[] args) {
//        eat1();
//
//        eat2("Banana");
//
//
//        System.out.println(eat3());

        int a = 34;
        int b = 45;

        swap(a, b);

        System.out.println(a);
        System.out.println(b);
    }

    private static void swap(int a, int b) {
        int t = a;
        a = b;
        b = t;

    }

    public static void eat1(){
        int a = 10 + 12; // some random work
    }

    public static void eat2(String food){
        System.out.println("I eat " + food);
    }

    public static int eat3(){
        return 50;
    }


}
