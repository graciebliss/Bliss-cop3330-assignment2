package ex28;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gracie Bliss
 */

import java.util.*;

public class app {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numArray = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.print("Enter a number: ");
            numArray[i] = in.nextInt();
        }

        System.out.println("The total is " + sum(numArray) + ".");

    }

    public static int sum(int[] numArray){

        int sum = 0;
        for(int i = 0; i < numArray.length; i++)
            sum += numArray[i];

        return sum;

    }

}
