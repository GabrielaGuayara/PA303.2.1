package com.perscholas.java_basics;

public class CastIntToDouble {

    public static void main(String[] args){
        //Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y. Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q. Print q again.

        int x, y;
        x = 5;
        y = 6;
        double q = (double)y/x;

        System.out.println(q);

        q = (double) y;
        System.out.println(q);
    }
}
