package com.perscholas.java_basics;

public class DivTwoDoubles {
    public static void main(String[] args){
        //Write a program that declares two double variables, assigns a number to each, and divides the larger by the smaller number. Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.

        double f,g;
        f = 10.30;
        g = 34.56;

        double div2 = g/f;

        System.out.println(div2);

        int newResult = (int)div2;

        System.out.println(newResult);
    }
}
