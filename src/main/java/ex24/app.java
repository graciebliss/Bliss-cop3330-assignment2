package ex24;

import java.util.Arrays;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gracie Bliss
 */

public class app {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");

        String first = "";
        String second = "";

        System.out.print("Enter the first string: ");
        first = in.nextLine();

        System.out.print("Enter the first string: ");
        second = in.nextLine();

        String output;
        if(isAnagram(first, second))
            output="\"" + first + "\" and " + "\"" + second + "\" are anagrams.";
        else
            output="\"" + first + "\" and " + "\"" + second + "\" are not anagrams.";

        System.out.print(output);

    }

    public static boolean isAnagram(String first, String second) {

        //Variable to keep track of status
        boolean anagram = true;

        if(first.length() != second.length())
            anagram = false;

        else {

            char[] firstArray = new char[first.length()];
            char[] secondArray = new char[second.length()];

            for(int i = 0; i < first.length(); i++) {

                firstArray[i] = first.charAt(i);
                secondArray[i] = second.charAt(i);

            }

            Arrays.sort(firstArray);
            Arrays.sort(secondArray);

            for(int i = 0; i < first.length(); i++)
                if (firstArray[i] != secondArray[i]) {
                    anagram = false;
                    break;
                }
        }

        return anagram;

    }

}
