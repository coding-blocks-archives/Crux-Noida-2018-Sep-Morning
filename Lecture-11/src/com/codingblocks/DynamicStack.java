package com.codingblocks;

public class DynamicStack extends Stack {

    @Override
    public boolean push(int item) {


        if (isFull()){

            System.out.println("Now we are doubling up");

            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        return super.push(item);
    }
}
