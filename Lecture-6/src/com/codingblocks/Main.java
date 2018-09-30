package com.codingblocks;



public class Main {

    public static void main(String[] args) {
	// write your code here
        pdi(4);
    }

    public static void pd(int n){

        if (n ==  0){
            return;
        }

        System.out.println(n);
        pd(n-1);
    }


    public static void pi(int n){

        if (n ==  0){
            return;
        }

        pi(n-1);
        System.out.println(n);

    }

    public static void pdi(int n){

        if (n ==  0){
            return;
        }

        if (n%2 != 0) {
            System.out.println(n);
        }

        pdi(n-1);

        if (n%2 == 0) {
            System.out.println(n);
        }

    }



    public static void pd5(){

        System.out.println(5);

        pd4();

        /////
    }
    public static void pd4(){

        System.out.println(4);

        pd3();
    }
    public static void pd3(){

        System.out.println(3);

        pd2();
    }
    public static void pd2(){

        System.out.println(2);

        pd1();
    }


    public static void pd1(){

        System.out.println(1);

    }



}
