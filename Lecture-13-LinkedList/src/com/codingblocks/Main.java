package com.codingblocks;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here

        LinkedList<String> list = new LinkedList<>();

        list.insertFirst("Shobhit");
        list.insertFirst("Mona");

        list.insertLast("Ruchika");
        list.insertLast("Sumit");

//        System.out.println(list.remove(2));

        list.display();

        list.reverse();

        list.display();

    }
}
