package com.codingblocks;

import java.nio.file.FileAlreadyExistsException;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(23);
        stack.display();

        stack.push(27);
        stack.display();

        stack.push(2);
        stack.display();

        stack.push(23);
        stack.display();

        stack.push(27);
        stack.display();

        stack.push(2);
        stack.display();

        for (int i = 0; i < 6; i++) {
            try {
                int a = 0/0;
                stack.pop();
                stack.display();
            }

            catch (FileAlreadyExistsException e){
                System.out.println(e.getMessage());
            }
            catch (ArithmeticException e){
                System.out.println("Ja math seekh ke aa");
            }
            catch (Exception e){
                System.out.println("Ja math seekh ke aa");
            }
        }

        System.out.println("But ye to kar de bhai");
    }
}
