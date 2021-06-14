package ex25;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gracie Bliss
 */

import java.util.*;

public class app {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String password = "";

        System.out.print("Enter a password: ");
        password = in.nextLine();

        String output;

        if (passwordValidator(password) == 1)
            output="The password " + password + " is a very weak password.";

        else if (passwordValidator(password) == 2)
            output="The password " + password + " is a weak password.";

        else if (passwordValidator(password) == 3)
            output="The password " + password + " is a strong password.";
        else
            output="The password " + password + " is a very strong password.";

        System.out.print(output);

    }

    public static int passwordValidator(String password) {

        int strength = 0;

        int numbers = 0;
        int special = 0;

        if(password.length() < 8) {

            if(password.charAt(0) >= 48 && password.charAt(0) <= 57)
                strength = 1;

            if((password.charAt(0) >= 65 && password.charAt(0) <= 90)||(password.charAt(0) >= 97 && password.charAt(0) <= 122))
                strength = 2;
        }
        else {
            for(int i = 0; i < password.length(); i++) {

                if(password.charAt(i) >= 48 && password.charAt(i) <= 57)
                    numbers++;

                else if(!(password.charAt(i) >= 48 && password.charAt(i) <= 57) && !((password.charAt(i) >= 65 && password.charAt(i) <= 90) ||(password.charAt(i) >= 97 && password.charAt(i) <= 122)))
                    special++;

            }

            if(numbers > 0)
                strength = 3;

            if(special > 0)
                strength = 4;

        }

        return strength;

    }

    public static String output(String password) {

        //Return the correct output statement depending on the strength of the password
        if (passwordValidator(password) == 1)
            return ("The password " + password + " is a very weak password");

        else if (passwordValidator(password) == 2)
            return ("The password " + password + " is a weak password");

        else if (passwordValidator(password) == 3)
            return ("The password " + password + " is a strong password");
        else
            return ("The password " + password + " is a very strong password");

    }
}
