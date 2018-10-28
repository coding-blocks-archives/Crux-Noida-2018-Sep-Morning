package com.codingblocks;

class Car extends Vehicle{

    int wheels = 4;


    public static void dhokha(){
        System.out.println("Dhokha by Car");
    }

//    @Override
    public void start() {
        System.out.println("I start in generic fashion");
    }

    protected void musk(){
        System.out.println("I smell like musk");
    }

    private class Engine {

    }
}
