package ex27;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gracie Bliss
 */

import java.util.*;

public class app {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String firstName = in.nextLine();

        System.out.print("Enter the last name: ");
        String lastName = in.nextLine();

        System.out.print("Enter the ZIP code: ");
        String zipString = in.nextLine();

        System.out.print("Enter the employee ID: ");
        String employeeID = in.nextLine();


        String outputFirstName = "";
        String outputLastName = "";
        String outputZipCode = "";
        String outputEmployeeID = "";
        String output = "";

        if(firstName.length() == 0)
            outputFirstName = "First name must be filled.\n";

        else if(!isNameValid(firstName))
            outputFirstName = "The first name must be at least 2 characters long.\n";

        if(lastName.length() == 0)
            outputLastName = "Last name must be filled.";

        else if(!isNameValid(lastName))
            outputLastName = "The last name must be at least 2 characters long.\n";

        if(employeeID.length() == 0)
            outputEmployeeID = "Employee ID must be filled.\n";

        else if(!isEmployeeIdValid(employeeID))
            outputEmployeeID = "The employee ID must be in the format AA-1234.\n";

        if(zipString.length() == 0)
            outputZipCode = "ZIP code must be filled.\n";

        else if(!isZipCodeValid(zipString))
            outputZipCode = "The ZIP code must be a 5 digit number.\n";

        if(outputFirstName == "" && outputLastName == "" && outputZipCode == "" && outputEmployeeID == "")
            output = "There were no errors found";
        else
            output = outputFirstName + outputLastName + outputEmployeeID + outputZipCode;

        System.out.print(output);
    }

    public static boolean isNameValid(String anyName) {

        if(anyName.length() == 0)
            return false;

        if(anyName.length() >= 2)
            return true;

        return false;
    }

    public static boolean isZipCodeValid(String zipCode) {

        if(zipCode.length() == 0)
            return false;
        if(zipCode.length() > 5)
            return false;

        for(int i = 0; i < zipCode.length(); i++)
            if(!(Character.isDigit(zipCode.charAt(i))))
                return false;

        return true;

    }


    public static boolean isEmployeeIdValid(String employeeID){

        if(employeeID.length() == 0)
            return false;

        if(employeeID.length() != 7)
            return false;

        if(!(Character.isLetter(employeeID.charAt(0)) || Character.isLetter(employeeID.charAt(1))))
            return false;

        if(employeeID.charAt(2) != '-')
            return false;

        for(int i = 3; i < employeeID.length(); i++)
            if(!(Character.isDigit(employeeID.charAt(i))))
                return false;

        return true;

    }

}
