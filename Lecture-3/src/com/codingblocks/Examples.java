package com.codingblocks;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {

        calculator();
//        Scanner s = new Scanner(System.in);
//
//        int number = s.nextInt();
//
//
//        System.out.println(mirror(number));

//        int digit = s.nextInt();
//
//        int c = countDigit(number, digit);

//        for (int i = 100; i < 1000; i++) {
//            if (isArm(i)){
//                System.out.println(i);
//            }
//        }

    }

    public static int count5(int num){
        int counter = 0;

        while (num > 0){
            int rem = num % 10;
            num = num / 10;

            if (rem == 5){
                counter++;
            }

        }

        return counter;
    }

    public static int countDigit(int num, int digit){
        int counter = 0;

        while (num > 0){
            int rem = num % 10;
            num = num / 10;

            if (rem == digit){
                counter++;
            }

        }

        return counter;
    }

    public static int reverse(int num){
        int result = 0;

        while (num > 0){
            int rem = num % 10;
            num = num / 10;

            result = result * 10 + rem;
        }

        return result;
    }

    public static boolean isArm(int num){

        int copy = num;

        int res = 0;

        while (copy > 0){
            int rem = copy % 10;
            copy = copy / 10;

            res = res + rem * rem * rem;
        }

        return res == num;
    }

    public static int mirror(int num){
        int m = 0;

        int p = 1;

        while (num > 0){
            int v = num % 10;
            num = num / 10;

            m = m + p * (int)Math.pow(10, v-1);
            p++;
        }

        return m;
    }

    public static void calculator(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            char ch = scanner.nextLine().charAt(0);

            if (ch == 'x' || ch == 'X'){
                break;
            }

            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());

            if (ch == '+'){
                System.out.println(a+b);
            }
            if (ch == '-'){
                System.out.println(a-b);
            }
            if (ch == '*'){
                System.out.println(a*b);
            }
        }
    }
}
