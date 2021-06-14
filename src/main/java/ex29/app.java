package ex29;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gracie Bliss
 */

import java.util.*;

public class app {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int returnRate = 0;
        boolean valid = false;

        while(valid == false){
            System.out.print("What is your rate of return? ");
            String temp = in.nextLine();

            boolean num = true;
            for(int i = 0; i < temp.length(); i++)
                if(!(Character.isDigit(temp.charAt(i))))
                    num = false;

            if(num == true && !(temp.equals("0"))) {
                returnRate = Integer.parseInt(temp);
                valid = true;
            }
        }

        System.out.println("It will take " + calculateYears(returnRate) + " years to double your investment.");

    }

    public static double calculateYears(int returnRate){
        return 72.0/returnRate;
    }
}

