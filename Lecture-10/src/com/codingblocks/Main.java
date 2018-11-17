package com.codingblocks;

import com.codingblocks.insaan.Human;

public class Main {

    public static void main(String[] args) {

        Human amit = new Human("Amit Garg");


        Human mohit = new Human("Mohit Sharma");

        mohit.drink();
        mohit.drink();
        mohit.drink();

        System.out.println(amit.balance);

        mohit.askCharity(amit);

        mohit.drink();

        System.out.println(amit.balance);


        System.out.println(Human.population);

        Human.genesis();

        System.out.println(Human.population);



//
//        Human mono = new Human();
//
//        System.out.println(anuj.name);
//        System.out.println(mohit.name);
//        System.out.println(mono.name);
//
//        System.out.println(anuj.legs);
//        System.out.println(mohit.legs);
//
//        anuj.legs = 1;
//
//        System.out.println(anuj.legs);
//        System.out.println(mohit.legs);
//
//        anuj.run();
//
//        mohit.run();
//
//        anuj.showoff();

    }
}
