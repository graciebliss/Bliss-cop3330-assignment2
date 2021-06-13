package ex38;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gracie Bliss
 */

import java.util.*;
import java.lang.String;


public class app {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by space: ");
        String nums=in.nextLine();

        int[] numbers=new int[nums.length()];
        int index=0;

        String space=" ";
        for(int i=0; i<nums.length(); i++){
            char ch=nums.charAt(i);
            String character=Character.toString(ch);
            if(!character.equals(space)) {
                numbers[index]=Integer.parseInt(character);
                index++;
            }
        }

        int[] evens=filterEvenNumbers(numbers);
        System.out.print("The even numbers are");
        for(int i=0; i<evens.length; i++){
            System.out.print(" "+evens[i]);
        }
        System.out.print(".");

    }

    public static int[] filterEvenNumbers(int[] array){
        int count=0;
        for(int i=0; i<array.length; i++){
            if(array[i]%2==0 && array[i]!=0){
                count++;
            }
        }
        int[] newArr=new int[count];
        int ind=0;
        for(int i=0; i<array.length; i++) {
            if (array[i] % 2 == 0 && array[i]!=0) {
                newArr[ind] = array[i];
                ind++;
            }
        }
        return newArr;
    }

}
