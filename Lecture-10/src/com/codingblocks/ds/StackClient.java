package com.codingblocks.ds;

public class StackClient {

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(23);
        stack.display();

        stack.push(43);
        stack.push(56);

        stack.display();

        stack.push(56);
        stack.push(46);

        stack.display();

        stack.pop();

        stack.display();

        stack.pop();

        stack.display();

        stack.pop();

        stack.display();

        stack.pop();

        stack.display();


    }
}
