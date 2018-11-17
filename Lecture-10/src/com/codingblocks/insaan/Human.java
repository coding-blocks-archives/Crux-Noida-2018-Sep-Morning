package com.codingblocks.insaan;

public class Human {

    public String name;

    public int legs;

    public static int population;

    public int balance;

    public Human(){
        this("Anonymous");
    }

    public Human(String name){
        this(name, 5000);
    }

    public Human(String name, int balance){
        this.name = name;
        this.legs = 2;
        this.balance = balance;

        population++;
    }



    public void run(){
        System.out.println(name + " runs with many legs " + legs);
    }

    public void showoff(){
        System.out.println("See I have this much money " + balance);
    }

    public void drink(){
        if (this.balance >= 2000){
            System.out.println("Party all night");
            this.balance = this.balance - 2000;
        } else {
            System.out.println("Bhai ghar se paise le kar aa");
        }
    }

    public void askCharity(Human bhola){
        if (bhola.balance >= 2000){
            this.balance = this.balance + 2000;
            bhola.balance = bhola.balance - 2000;
        }
    }

    public static void genesis(){
        Human.population = 0;
    }
}
